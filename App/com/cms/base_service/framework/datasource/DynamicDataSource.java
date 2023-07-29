 package com.cms.base_service.framework.datasource;

 import com.cms.base_service.framework.datasource.DynamicDataSourceContextHolder;
 import java.util.Map;
 import javax.sql.DataSource;
 import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;






 public class DynamicDataSource
   extends AbstractRoutingDataSource
 {
   public DynamicDataSource(DataSource defaultTargetDataSource, Map<Object, Object> targetDataSources) {
/* 17 */     setDefaultTargetDataSource(defaultTargetDataSource);
/* 18 */     setTargetDataSources(targetDataSources);
/* 19 */     afterPropertiesSet();
   }



   protected Object determineCurrentLookupKey() {
/* 25 */     return DynamicDataSourceContextHolder.getDataSourceType();
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\datasource\DynamicDataSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */