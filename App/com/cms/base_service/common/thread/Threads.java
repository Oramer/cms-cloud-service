 package com.cms.base_service.common.thread;

 import java.util.concurrent.CancellationException;
 import java.util.concurrent.ExecutionException;
 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Future;
 import java.util.concurrent.TimeUnit;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;






 public class Threads
 {
/* 18 */   private static final Logger logger = LoggerFactory.getLogger(com.cms.base_service.common.thread.Threads.class);




   public static void sleep(long milliseconds) {
     try {
/* 25 */       Thread.sleep(milliseconds);
/* 26 */     } catch (InterruptedException e) {
       return;
     }
   }








   public static void shutdownAndAwaitTermination(ExecutorService pool) {
/* 39 */     if (pool != null && !pool.isShutdown()) {
/* 40 */       pool.shutdown();
       try {
/* 42 */         if (!pool.awaitTermination(120L, TimeUnit.SECONDS)) {
/* 43 */           pool.shutdownNow();
/* 44 */           if (!pool.awaitTermination(120L, TimeUnit.SECONDS)) {
/* 45 */             logger.info("Pool did not terminate");
           }
         }
/* 48 */       } catch (InterruptedException ie) {
/* 49 */         pool.shutdownNow();
/* 50 */         Thread.currentThread().interrupt();
       }
     }
   }




   public static void printException(Runnable r, Throwable t) {
/* 59 */     if (t == null && r instanceof Future) {
       try {
/* 61 */         Future<?> future = (Future)r;
/* 62 */         if (future.isDone()) {
/* 63 */           future.get();
         }
/* 65 */       } catch (CancellationException ce) {
/* 66 */         t = ce;
/* 67 */       } catch (ExecutionException ee) {
/* 68 */         t = ee.getCause();
/* 69 */       } catch (InterruptedException ie) {
/* 70 */         Thread.currentThread().interrupt();
       }
     }
/* 73 */     if (t != null)
/* 74 */       logger.error(t.getMessage(), t); 
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\thread\Threads.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */