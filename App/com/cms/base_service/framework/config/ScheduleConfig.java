 package com.cms.base_service.framework.config;

 import java.util.Properties;
 import javax.sql.DataSource;
 import org.springframework.context.annotation.Bean;
 import org.springframework.scheduling.quartz.SchedulerFactoryBean;








 public class ScheduleConfig
 {
   @Bean
   public SchedulerFactoryBean schedulerFactoryBean(DataSource dataSource) {
/* 19 */     SchedulerFactoryBean factory = new SchedulerFactoryBean();
/* 20 */     factory.setDataSource(dataSource);


/* 23 */     Properties prop = new Properties();
/* 24 */     prop.put("org.quartz.scheduler.instanceName", "cmsScheduler");
/* 25 */     prop.put("org.quartz.scheduler.instanceId", "AUTO");

/* 27 */     prop.put("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");
/* 28 */     prop.put("org.quartz.threadPool.threadCount", "20");
/* 29 */     prop.put("org.quartz.threadPool.threadPriority", "5");

/* 31 */     prop.put("org.quartz.jobStore.class", "org.springframework.scheduling.quartz.LocalDataSourceJobStore");

/* 33 */     prop.put("org.quartz.jobStore.isClustered", "true");
/* 34 */     prop.put("org.quartz.jobStore.clusterCheckinInterval", "15000");
/* 35 */     prop.put("org.quartz.jobStore.maxMisfiresToHandleAtATime", "1");
/* 36 */     prop.put("org.quartz.jobStore.txIsolationLevelSerializable", "true");



/* 40 */     prop.put("org.quartz.jobStore.misfireThreshold", "12000");
/* 41 */     prop.put("org.quartz.jobStore.tablePrefix", "QRTZ_");
/* 42 */     factory.setQuartzProperties(prop);

/* 44 */     factory.setSchedulerName("cmsScheduler");

/* 46 */     factory.setStartupDelay(1);
/* 47 */     factory.setApplicationContextSchedulerContextKey("applicationContextKey");


/* 50 */     factory.setOverwriteExistingJobs(true);

/* 52 */     factory.setAutoStartup(true);

/* 54 */     return factory;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\ScheduleConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */