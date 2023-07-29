package com.cms.base_service.framework.config;

import com.cms.base_service.common.utils.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import javax.sql.DataSource;
import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.util.ClassUtils;












public class MyBatisConfig
{
  @Autowired
  private Environment env;
  static final String DEFAULT_RESOURCE_PATTERN = "**/*.class";
  
  public static String setTypeAliasesPackage(String typeAliasesPackage) {
/*  43 */     PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
/*  44 */     CachingMetadataReaderFactory cachingMetadataReaderFactory = new CachingMetadataReaderFactory((ResourceLoader)pathMatchingResourcePatternResolver);
/*  45 */     List<String> allResult = new ArrayList<>();
    
    try {
/*  48 */       for (String aliasesPackage : typeAliasesPackage.split(",")) {
        
/*  50 */         List<String> result = new ArrayList<>();
        
/*  52 */         aliasesPackage = "classpath*:" + ClassUtils.convertClassNameToResourcePath(aliasesPackage.trim()) + "/" + "**/*.class";
/*  53 */         Resource[] resources = pathMatchingResourcePatternResolver.getResources(aliasesPackage);
/*  54 */         if (resources != null && resources.length > 0) {
          
/*  56 */           MetadataReader metadataReader = null;
/*  57 */           for (Resource resource : resources) {
            
/*  59 */             if (resource.isReadable()) {
              
/*  61 */               metadataReader = cachingMetadataReaderFactory.getMetadataReader(resource);
              
              try {
/*  64 */                 result.add(Class.forName(metadataReader.getClassMetadata().getClassName()).getPackage().getName());
              }
/*  66 */               catch (ClassNotFoundException e) {
                
/*  68 */                 e.printStackTrace();
              } 
            } 
          } 
        } 
/*  73 */         if (result.size() > 0) {
          
/*  75 */           HashSet<String> hashResult = new HashSet<>(result);
/*  76 */           allResult.addAll(hashResult);
        } 
      } 
/*  79 */       if (allResult.size() > 0)
      {
/*  81 */         typeAliasesPackage = String.join(",", (CharSequence[])allResult.<String>toArray(new String[0]));
      }
      else
      {
/*  85 */         throw new RuntimeException("mybatis typeAliasesPackage 路径扫描错误,参数typeAliasesPackage:" + typeAliasesPackage + "未找到任何包");
      }
    
/*  88 */     } catch (IOException e) {
      
/*  90 */       e.printStackTrace();
    } 
/*  92 */     return typeAliasesPackage;
  }

  
  public Resource[] resolveMapperLocations(String[] mapperLocations) {
/*  97 */     PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
/*  98 */     List<Resource> resources = new ArrayList<>();
/*  99 */     if (mapperLocations != null)
    {
/* 101 */       for (String mapperLocation : mapperLocations) {

        
        try {
/* 105 */           Resource[] mappers = pathMatchingResourcePatternResolver.getResources(mapperLocation);
/* 106 */           resources.addAll(Arrays.asList(mappers));
        }
/* 108 */         catch (IOException iOException) {}
      } 
    }


    
/* 114 */     return resources.<Resource>toArray(new Resource[resources.size()]);
  }

  
  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
/* 120 */     String typeAliasesPackage = this.env.getProperty("mybatis.typeAliasesPackage");
/* 121 */     String mapperLocations = this.env.getProperty("mybatis.mapperLocations");
/* 122 */     String configLocation = this.env.getProperty("mybatis.configLocation");
/* 123 */     typeAliasesPackage = setTypeAliasesPackage(typeAliasesPackage);
/* 124 */     VFS.addImplClass(SpringBootVFS.class);
    
/* 126 */     SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
/* 127 */     sessionFactory.setDataSource(dataSource);
/* 128 */     sessionFactory.setTypeAliasesPackage(typeAliasesPackage);
/* 129 */     sessionFactory.setMapperLocations(resolveMapperLocations(StringUtils.split(mapperLocations, ",")));
/* 130 */     sessionFactory.setConfigLocation((new DefaultResourceLoader()).getResource(configLocation));
/* 131 */     return sessionFactory.getObject();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\MyBatisConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */