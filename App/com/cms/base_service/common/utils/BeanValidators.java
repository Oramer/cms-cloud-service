 package com.cms.base_service.common.utils;
 
 import java.util.Set;
 import javax.validation.ConstraintViolation;
 import javax.validation.ConstraintViolationException;
 import javax.validation.Validator;
 
 
 
 
 
 
 
 
 public class BeanValidators
 {
   public static void validateWithException(Validator validator, Object object, Class<?>... groups) throws ConstraintViolationException {
/* 18 */     Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
/* 19 */     if (!constraintViolations.isEmpty())
     {
/* 21 */       throw new ConstraintViolationException(constraintViolations);
     }
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\BeanValidators.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */