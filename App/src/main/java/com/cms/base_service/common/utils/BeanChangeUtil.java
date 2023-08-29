 package com.cms.base_service.common.utils;

 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import com.cms.base_service.annotation.Excel;

 import java.beans.PropertyDescriptor;
 import java.lang.reflect.Field;
 import java.lang.reflect.Method;


 public class BeanChangeUtil<T>
 {
/* 15 */   private static final Logger log = LoggerFactory.getLogger(BeanChangeUtil.class);



   public String checkBeanChange(Object oldBean, Object newBean) {
/* 20 */     BeanChangeUtil<T> t = new BeanChangeUtil();
/* 21 */     String str = t.contrastObj(oldBean, newBean);
/* 22 */     log.error(str);
/* 23 */     return str;
   }

   public String contrastObj(Object oldBean, Object newBean) {
/* 27 */     StringBuilder str = new StringBuilder();
/* 28 */     T pojo1 = (T)oldBean;
/* 29 */     T pojo2 = (T)newBean;

     try {
/* 32 */       Class<?> clazz = pojo1.getClass();
/* 33 */       Field[] fields = clazz.getDeclaredFields();
/* 34 */       int i = 1;
/* 35 */       for (Field field : fields) {

/* 37 */         if (!"serialVersionUID".equals(field.getName())) {


/* 40 */           PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);

/* 42 */           Method getMethod = pd.getReadMethod();
/* 43 */           Object o1 = getMethod.invoke(pojo1, new Object[0]);
/* 44 */           Object o2 = getMethod.invoke(pojo2, new Object[0]);
/* 45 */           if (o1 != null && o2 != null)
           {

/* 48 */             if (!o1.toString().equals(o2.toString()))
/* 49 */             { String nameStr = "";
/* 50 */               if (field.getAnnotation(Excel.class) != null)
               {
/* 52 */                 nameStr = ((Excel)field.<Excel>getAnnotation(Excel.class)).name();
               }
/* 54 */               str.append("[" + nameStr + "]:编辑前:" + o1 + ",编辑后:" + o2 + " | ");
/* 55 */               i++; }  } 
         }
       }
/* 58 */     } catch (Exception e) {
/* 59 */       e.printStackTrace();
     }
/* 61 */     return str.toString();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\BeanChangeUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */