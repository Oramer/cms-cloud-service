 package com.cms.base_service.common.thread;
 
 import com.cms.base_service.common.thread.Threads;
 import com.cms.base_service.common.utils.SpringUtil;
 import java.util.TimerTask;
 import java.util.concurrent.ScheduledExecutorService;
 import java.util.concurrent.TimeUnit;
 
 
 
 
 
 
 
 
 
 public class TreadUtils
 {
/* 19 */   private final int OPERATE_DELAY_TIME = 1000;
 
 
 
   
/* 24 */   private ScheduledExecutorService executor = (ScheduledExecutorService)SpringUtil.getBean("scheduledExecutorService");
 
 
 
 
 
 
   
/* 32 */   private static com.cms.base_service.common.thread.TreadUtils me = new com.cms.base_service.common.thread.TreadUtils();
   
   public static com.cms.base_service.common.thread.TreadUtils me() {
/* 35 */     return me;
   }
 
 
 
 
 
   
   public void execute(TimerTask task) {
/* 44 */     this.executor.schedule(task, 1000L, TimeUnit.MILLISECONDS);
   }
 
 
 
   
   public void shutdown() {
/* 51 */     Threads.shutdownAndAwaitTermination(this.executor);
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\thread\TreadUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */