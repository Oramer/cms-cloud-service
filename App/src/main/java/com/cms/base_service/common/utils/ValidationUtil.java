 package com.cms.base_service.common.utils;

 import com.cms.base_service.exception.ParamsValidityException;

 import javax.validation.ConstraintViolation;
 import javax.validation.Validation;
 import javax.validation.Validator;
 import javax.validation.ValidatorFactory;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Set;








 public class ValidationUtil
 {
/* 22 */   private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

   public static <T> void validate(T t) {
/* 25 */     Validator validator = factory.getValidator();
/* 26 */     Set<ConstraintViolation<T>> constraintViolations = validator.validate(t, new Class[0]);

/* 28 */     if (!constraintViolations.isEmpty()) {
/* 29 */       List<String> messageList = new ArrayList<>();
/* 30 */       StringBuilder sb = new StringBuilder("");
/* 31 */       for (ConstraintViolation<T> constraintViolation : constraintViolations) {
/* 32 */         messageList.add(constraintViolation.getMessage());
/* 33 */         sb.append(constraintViolation.getMessage()).append(" | ");
       }
/* 35 */       String tips = sb.toString();
/* 36 */       if (StringUtils.isNotEmpty(tips))
/* 37 */         throw new ParamsValidityException(tips.substring(0, tips.length() - 1));
     }
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ValidationUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */