package com.cms.base_service.framework.aspectj.lang.annotation;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import com.cms.base_service.common.utils.poi.ExcelHandlerAdapter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Excel {
  int sort() default 2147483647;
  
  String name() default "";
  
  String dateFormat() default "";
  
  String dictType() default "";
  
  String readConverterExp() default "";
  
  String separator() default ",";
  
  int scale() default -1;
  
  int roundingMode() default 6;
  
  double height() default 14.0D;
  
  double width() default 16.0D;
  
  String suffix() default "";
  
  String defaultValue() default "";
  
  String prompt() default "";
  
  String[] combo() default {};
  
  boolean isExport() default true;
  
  String targetAttr() default "";
  
  boolean isStatistics() default false;
  
  ColumnType cellType() default ColumnType.STRING;
  
  IndexedColors color() default IndexedColors.BLACK;
  
  HorizontalAlignment align() default HorizontalAlignment.CENTER;
  
  Class<?> handler() default ExcelHandlerAdapter.class;
  
  String[] args() default {};
  
  Type type() default Type.ALL;

  public enum Type
  {
    ALL(0), EXPORT(1), IMPORT(2);
    private final int value;

    Type(int value)
    {
      this.value = value;
    }

    public int value()
    {
      return this.value;
    }
  }

  public enum ColumnType
  {
    NUMERIC(0), STRING(1), IMAGE(2);
    private final int value;

    ColumnType(int value)
    {
      this.value = value;
    }

    public int value()
    {
      return this.value;
    }
  }

}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\aspectj\lang\annotation\Excel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */