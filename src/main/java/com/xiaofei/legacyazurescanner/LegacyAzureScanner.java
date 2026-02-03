package com.xiaofei.legacyazurescanner;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.xiaofei.legacyazurescanner.task.UrlTask;
import com.xiaofei.legacyazurescanner.task.TaskExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaofeicao
 */
public class LegacyAzureScanner {
    private static final Logger LOGGER = LoggerFactory.getLogger(LegacyAzureScanner.class);

    private final String rootURL;
    private final TaskExecutor taskExecutor;

    public LegacyAzureScanner(String rootUrl, int parallelism) {
        this.rootURL = rootUrl;
        taskExecutor = new TaskExecutor(parallelism);
    }

    public void start() {
        taskExecutor.submitTask(new UrlTask(rootURL, taskExecutor));
        Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setDaemon(false).build()).scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                TaskExecutor.Snapshot taskSnapshot = taskExecutor.snapshot();
                LOGGER.info(taskSnapshot.getSummary());
                if (taskSnapshot.isAllComplete()) {
                    LOGGER.info("[TaskResult]: {}", taskSnapshot);
                    LOGGER.info("[TaskTracker] All tasks complete, exit.");
                    System.exit(0);
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}
