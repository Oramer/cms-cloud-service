 package com.cms.system_service.system.domain;

 import com.cms.base_service.common.model.BaseEntity;
 import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
 import javax.validation.constraints.Size;
 import org.hibernate.validator.constraints.NotBlank;



















 public class SysConfig
   extends BaseEntity
 {
   private static final long serialVersionUID = 1L;
   @Excel(name = "参数主键", cellType = Excel.ColumnType.NUMERIC)
   private Long configId;
   @Excel(name = "参数名称")
   private String configName;
   @Excel(name = "参数键名")
   private String configKey;
   @Excel(name = "参数键值")
   private String configValue;
   @Excel(name = "系统内置", readConverterExp = "Y=是,N=否")
   private String configType;

   public Long getConfigId() {
/* 42 */     return this.configId;
   }


   public void setConfigId(Long configId) {
/* 47 */     this.configId = configId;
   }


   @NotBlank(message = "参数名称不能为空")
   @Size(min = 0, max = 100, message = "参数名称不能超过100个字符")
   public String getConfigName() {
/* 54 */     return this.configName;
   }


   public void setConfigName(String configName) {
/* 59 */     this.configName = configName;
   }


   @NotBlank(message = "参数键名长度不能为空")
   @Size(min = 0, max = 100, message = "参数键名长度不能超过100个字符")
   public String getConfigKey() {
/* 66 */     return this.configKey;
   }


   public void setConfigKey(String configKey) {
/* 71 */     this.configKey = configKey;
   }


   @NotBlank(message = "参数键值不能为空")
   @Size(min = 0, max = 500, message = "参数键值长度不能超过500个字符")
   public String getConfigValue() {
/* 78 */     return this.configValue;
   }


   public void setConfigValue(String configValue) {
/* 83 */     this.configValue = configValue;
   }


   public String getConfigType() {
/* 88 */     return this.configType;
   }


   public void setConfigType(String configType) {
/* 93 */     this.configType = configType;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */