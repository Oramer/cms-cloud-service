package com.cms.system_service.quartz.util;

import com.cms.base_service.common.utils.SpringUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.system_service.quartz.domain.SysJob;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;













public class JobInvokeUtil
{
  public static void invokeMethod(SysJob sysJob) throws Exception {
/*  26 */     String invokeTarget = sysJob.getInvokeTarget();
/*  27 */     String beanName = getBeanName(invokeTarget);
/*  28 */     String methodName = getMethodName(invokeTarget);
/*  29 */     List<Object[]> methodParams = getMethodParams(invokeTarget);

/*  31 */     if (!isValidClassName(beanName)) {

/*  33 */       Object bean = SpringUtils.getBean(beanName);
/*  34 */       invokeMethod(bean, methodName, methodParams);
    }
    else {

/*  38 */       Object bean = Class.forName(beanName).newInstance();
/*  39 */       invokeMethod(bean, methodName, methodParams);
    }
  }











  private static void invokeMethod(Object bean, String methodName, List<Object[]> methodParams) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/*  54 */     if (StringUtils.isNotNull(methodParams) && methodParams.size() > 0) {

/*  56 */       Method method = bean.getClass().getDeclaredMethod(methodName, getMethodParamsType(methodParams));
/*  57 */       method.invoke(bean, getMethodParamsValue(methodParams));
    }
    else {

/*  61 */       Method method = bean.getClass().getDeclaredMethod(methodName, new Class[0]);
/*  62 */       method.invoke(bean, new Object[0]);
    }
  }







  public static boolean isValidClassName(String invokeTarget) {
/*  73 */     return (StringUtils.countMatches(invokeTarget, ".") > 1);
  }








  public static String getBeanName(String invokeTarget) {
/*  84 */     String beanName = StringUtils.substringBefore(invokeTarget, "(");
/*  85 */     return StringUtils.substringBeforeLast(beanName, ".");
  }








  public static String getMethodName(String invokeTarget) {
/*  96 */     String methodName = StringUtils.substringBefore(invokeTarget, "(");
/*  97 */     return StringUtils.substringAfterLast(methodName, ".");
  }








  public static List<Object[]> getMethodParams(String invokeTarget) {
/* 108 */     String methodStr = StringUtils.substringBetween(invokeTarget, "(", ")");
/* 109 */     if (StringUtils.isEmpty(methodStr))
    {
/* 111 */       return null;
    }
/* 113 */     String[] methodParams = methodStr.split(",");
/* 114 */     List<Object[]> classs = new LinkedList();
/* 115 */     for (int i = 0; i < methodParams.length; i++) {

/* 117 */       String str = StringUtils.trimToEmpty(methodParams[i]);

/* 119 */       if (StringUtils.contains(str, "'")) {

/* 121 */         classs.add(new Object[] { StringUtils.replace(str, "'", ""), String.class });

      }
/* 124 */       else if (StringUtils.equals(str, "true") || StringUtils.equalsIgnoreCase(str, "false")) {

/* 126 */         classs.add(new Object[] { Boolean.valueOf(str), Boolean.class });

      }
/* 129 */       else if (StringUtils.containsIgnoreCase(str, "L")) {

/* 131 */         classs.add(new Object[] { Long.valueOf(StringUtils.replaceIgnoreCase(str, "L", "")), Long.class });

      }
/* 134 */       else if (StringUtils.containsIgnoreCase(str, "D")) {

/* 136 */         classs.add(new Object[] { Double.valueOf(StringUtils.replaceIgnoreCase(str, "D", "")), Double.class });

      }
      else {

/* 141 */         classs.add(new Object[] { Integer.valueOf(str), Integer.class });
      }
    }
/* 144 */     return classs;
  }








  public static Class<?>[] getMethodParamsType(List<Object[]> methodParams) {
/* 155 */     Class<?>[] classs = new Class[methodParams.size()];
/* 156 */     int index = 0;
/* 157 */     for (Object[] os : methodParams) {

/* 159 */       classs[index] = (Class)os[1];
/* 160 */       index++;
    }
/* 162 */     return classs;
  }








  public static Object[] getMethodParamsValue(List<Object[]> methodParams) {
/* 173 */     Object[] classs = new Object[methodParams.size()];
/* 174 */     int index = 0;
/* 175 */     for (Object[] os : methodParams) {

/* 177 */       classs[index] = os[0];
/* 178 */       index++;
    }
/* 180 */     return classs;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\quart\\util\JobInvokeUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */