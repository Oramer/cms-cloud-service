package com.cms.base_service.common.thread;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;


@Configuration
public class ThreadService {
    /* 15 */   private int corePoolSize = 10;


    /* 18 */   private int maxPoolSize = 10;


    /* 21 */   private int queueCapacity = 10;


    /* 24 */   private int keepAliveSeconds = 300;

    @Bean(name = {"threadPoolTaskExecutor"})
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        /* 28 */
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        /* 29 */
        executor.setMaxPoolSize(this.maxPoolSize);
        /* 30 */
        executor.setCorePoolSize(this.corePoolSize);
        /* 31 */
        executor.setQueueCapacity(this.queueCapacity);
        /* 32 */
        executor.setKeepAliveSeconds(this.keepAliveSeconds);

        /* 34 */
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        /* 35 */
        return executor;
    }


    @Bean(name = {"scheduledExecutorService"})
    protected ScheduledExecutorService scheduledExecutorService() {
        /* 41 */
//        return (ScheduledExecutorService) new Object(this, this.corePoolSize, (ThreadFactory) (new BasicThreadFactory.Builder())
///* 42 */.namingPattern("SD-PO-%d").daemon(true).build());
        return null;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\thread\ThreadService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */