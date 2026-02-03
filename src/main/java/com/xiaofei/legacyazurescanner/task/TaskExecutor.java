package com.xiaofei.legacyazurescanner.task;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author xiaofeicao
 */
public class TaskExecutor {
    private final ReadWriteLock taskLock = new ReentrantReadWriteLock();
    private final List<UrlTask> taskList = new ArrayList<>();
    private final ExecutorService executorService;

    public TaskExecutor(int parallelism) {
        executorService = Executors.newFixedThreadPool(parallelism);
    }

    public void submitTask(UrlTask urlTask) {
        taskLock.writeLock().lock();
        try {
            taskList.add(urlTask);
            executorService.submit(urlTask);
        } finally {
            taskLock.writeLock().unlock();
        }
    }

    public Snapshot snapshot() {
        taskLock.readLock().lock();
        try {
            boolean allComplete = true;

            int total = 0;
            int branchTasksTotal = 0;
            int branchTasksSucceeded = 0;
            int branchTasksInProgress = 0;
            int branchTasksFailed = 0;
            int leafTasksTotal = 0;
            int leafTasksInProgress = 0;
            int leafTasksSucceeded = 0;
            int leafTasksFailed = 0;
            int unknown = 0;
            List<String> artifacts = new ArrayList<>();
            for (UrlTask task : taskList) {
                total += 1;
                if (task.status() == TaskState.IN_PROGRESS) {
                    allComplete = false;
                }
                switch (task.type()) {
                    case BRANCH:
                        branchTasksTotal += 1;
                        switch(task.status()) {
                            case SUCCEEDED:
                                branchTasksSucceeded += 1;
                                break;
                            case IN_PROGRESS:
                                branchTasksInProgress += 1;
                                break;
                            case FAILED:
                                branchTasksFailed +=1;
                                break;
                        }
                        break;
                    case LEAF:
                        leafTasksTotal += 1;
                        switch (task.status()) {
                            case SUCCEEDED:
                                leafTasksSucceeded += 1;
                                if (task.result() != null) {
                                    artifacts.add(task.result());
                                }
                                break;
                            case IN_PROGRESS:
                                leafTasksInProgress += 1;
                                break;
                            case FAILED:
                                leafTasksFailed +=1;
                                break;
                        }
                        break;
                    default:
                        unknown += 1;
                }
            }
            String summary = String.format("[TaskTracker] total: %d, branch total: %d, branch success: %d, branch in progress: %d, branch failed: %d, leaf total: %d, leaf success: %d, leaf in progress: %d, leaf failed: %d, unknown:%d.", total, branchTasksTotal, branchTasksSucceeded, branchTasksInProgress, branchTasksFailed, leafTasksTotal, leafTasksSucceeded, leafTasksInProgress, leafTasksFailed, unknown);
            Snapshot snapshot = new Snapshot(allComplete, summary);
            snapshot.getArtifacts().addAll(artifacts);
            return snapshot;
        } finally {
            taskLock.readLock().unlock();
        }
    }

    public static class Snapshot {
        final boolean allComplete;
        final String summary;
        List<String> artifacts = new ArrayList<>();
        List<String> failedLinks = new ArrayList<>();

        Snapshot(boolean allComplete, String summary) {
            this.allComplete = allComplete;
            this.summary = summary;
        }

        public boolean isAllComplete() {
            return allComplete;
        }

        public String getSummary() {
            return summary;
        }

        public List<String> getArtifacts() {
            return artifacts;
        }

        public List<String> getFailedLinks() {
            return failedLinks;
        }

        @Override
        public String toString() {
            return "Snapshot{" +
                "artifacts=" + artifacts +
                ", failedLinks=" + failedLinks +
                '}';
        }
    }
}
