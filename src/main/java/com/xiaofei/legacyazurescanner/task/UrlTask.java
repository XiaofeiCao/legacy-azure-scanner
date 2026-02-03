package com.xiaofei.legacyazurescanner.task;

import com.xiaofei.legacyazurescanner.maven.MavenBranchPage;
import com.xiaofei.legacyazurescanner.maven.MavenLeafPage;
import com.xiaofei.legacyazurescanner.maven.MavenPage;
import com.xiaofei.legacyazurescanner.maven.MavenPageRetriever;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author xiaofeicao
 */
public class UrlTask implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(UrlTask.class);
    private final TaskExecutor executor;
    private final MavenPageRetriever mavenPageRetriever;
    private TaskType type;
    private String result;
    private String url;
    private TaskState status = TaskState.IN_PROGRESS;

    public UrlTask(String url, TaskExecutor executor) {
        this.url = url.endsWith("/") ? url : url + "/";
        this.executor = executor;
        this.type = TaskType.UNKNOWN;
        this.mavenPageRetriever = new MavenPageRetriever();
    }

    @Override
    public void run() {
        try {
            MavenPage page = mavenPageRetriever.retrieve(url);
            if (page instanceof MavenBranchPage) {
                this.type = TaskType.BRANCH;
                List<String> artifactLinks = ((MavenBranchPage) page).getArtifactLinks();
                for (String artifactLink : artifactLinks) {
                    executor.submitTask(new UrlTask(artifactLink, executor));
                }
            } else if (page instanceof MavenLeafPage) {
                this.type = TaskType.LEAF;
                if (((MavenLeafPage) page).isActive()) {
                    this.result = ((MavenLeafPage) page).getResult();
                }
            }
            this.status = TaskState.SUCCEEDED;
        } catch (Exception e) {
            LOGGER.error("[Task] Retrieve URL failed: {}", url, e);
            this.status = TaskState.FAILED;
        }
    }

    public TaskType type() {
        return type;
    }

    public String result() {
        return result;
    }

    public TaskState status() {
        return status;
    }
}
