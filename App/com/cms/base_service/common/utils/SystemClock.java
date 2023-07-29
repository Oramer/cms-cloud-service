package com.cms.base_service.common.utils;

import java.sql.Timestamp;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;


public class SystemClock {
    private final long period;
    private final AtomicLong now;

    private SystemClock(long period) {
        /* 20 */
        this.period = period;
        /* 21 */
        this.now = new AtomicLong(System.currentTimeMillis());
        /* 22 */
        scheduleClockUpdating();
    }


    private static com.cms.base_service.common.utils.SystemClock instance() {
        /* 30 */
        return null;
    }

    private void scheduleClockUpdating() {
        /* 34 */
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor((ThreadFactory) new Object());






        /* 41 */
        scheduler.scheduleAtFixedRate((Runnable) new Object(), this.period, this.period, TimeUnit.MILLISECONDS);
    }


    private long currentTimeMillis() {
        /* 49 */
        return this.now.get();
    }

    public static long now() {
        /* 53 */
        return instance().currentTimeMillis();
    }

    public static String nowDate() {
        /* 57 */
        return (new Timestamp(instance().currentTimeMillis())).toString();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\SystemClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */