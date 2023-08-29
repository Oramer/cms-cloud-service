package com.cms.base_service.common.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;


public class DateUtils
        extends org.apache.commons.lang3.time.DateUtils {
    /*  21 */   public static String YYYY = "yyyy";

    /*  23 */   public static String YYYY_MM = "yyyy-MM";

    /*  25 */   public static String YYYY_MM_DD = "yyyy-MM-dd";

    /*  27 */   public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    /*  29 */   public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /*  31 */   private static String[] parsePatterns = new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};


    public static String getNowDate() {
        /*  46 */
        return getDate();
    }

    public static Date getNowDateR() {
        /*  49 */
        return new Date();
    }


    public static String getDate() {
        /*  57 */
        return dateTimeNow(YYYY_MM_DD);
    }

    public static final String getTime() {
        /*  61 */
        return dateTimeNow(YYYY_MM_DD_HH_MM_SS);
    }

    public static final String dateTimeNow() {
        /*  65 */
        return dateTimeNow(YYYYMMDDHHMMSS);
    }

    public static final String dateTimeNow(String format) {
        /*  69 */
        return parseDateToStr(format, new Date());
    }

    public static final String dateTime(Date date) {
        /*  73 */
        return parseDateToStr(YYYY_MM_DD, date);
    }

    public static final String parseDateToStr(String format, Date date) {
        /*  77 */
        return (new SimpleDateFormat(format)).format(date);
    }

    public static final Date dateTime(String format, String ts) {
        try {
            /*  82 */
            return (new SimpleDateFormat(format)).parse(ts);
            /*  83 */
        } catch (ParseException e) {
            /*  84 */
            throw new RuntimeException(e);
        }
    }


    public static final String datePath() {
        /*  92 */
        Date now = new Date();
        /*  93 */
        return DateFormatUtils.format(now, "yyyyMMdd");
    }


    public static final String dateTime() {
        /* 100 */
        Date now = new Date();
        /* 101 */
        return DateFormatUtils.format(now, "yyyyMMdd");
    }


    public static Date parseDate(Object str) {
        /* 108 */
        if (str == null) {
            /* 109 */
            return null;
        }
        try {
            /* 112 */
            return parseDate(str.toString(), parsePatterns);
            /* 113 */
        } catch (ParseException e) {
            /* 114 */
            return null;
        }
    }


    public static Date getServerStartDate() {
        /* 122 */
        long time = ManagementFactory.getRuntimeMXBean().getStartTime();
        /* 123 */
        return new Date(time);
    }


    public static int differentDaysByMillisecond(Date date1, Date date2) {
        /* 130 */
        return Math.abs((int) ((date2.getTime() - date1.getTime()) / 86400000L));
    }


    public static String getDatePoor(Date endDate, Date nowDate) {
        /* 137 */
        long nd = 86400000L;
        /* 138 */
        long nh = 3600000L;
        /* 139 */
        long nm = 60000L;


        /* 142 */
        long diff = endDate.getTime() - nowDate.getTime();

        /* 144 */
        long day = diff / nd;

        /* 146 */
        long hour = diff % nd / nh;

        /* 148 */
        long min = diff % nd % nh / nm;


        /* 151 */
        return day + "天" + hour + "小时" + min + "分钟";
    }


    public static Date toDate(LocalDateTime temporalAccessor) {
        /* 158 */
        ZonedDateTime zdt = temporalAccessor.atZone(ZoneId.systemDefault());
        /* 159 */
        return Date.from(zdt.toInstant());
    }


    public static Date toDate(LocalDate temporalAccessor) {
        /* 166 */
        LocalDateTime localDateTime = LocalDateTime.of(temporalAccessor, LocalTime.of(0, 0, 0));
        /* 167 */
        ZonedDateTime zdt = localDateTime.atZone(ZoneId.systemDefault());
        /* 168 */
        return Date.from(zdt.toInstant());
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\DateUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */