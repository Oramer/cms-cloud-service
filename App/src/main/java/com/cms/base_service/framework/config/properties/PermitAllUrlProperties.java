package com.cms.base_service.framework.config.properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import com.cms.base_service.framework.aspectj.lang.annotation.Anonymous;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;


@Configuration
public class PermitAllUrlProperties
        implements InitializingBean, ApplicationContextAware {
    /* 29 */   private static final Pattern PATTERN = Pattern.compile("\\{(.*?)\\}");

    private ApplicationContext applicationContext;

    /* 33 */   private List<String> urls = new ArrayList<>();

    /* 35 */   public String ASTERISK = "*";


    @Override
    public void afterPropertiesSet() {
        /* 40 */
        RequestMappingHandlerMapping mapping = (RequestMappingHandlerMapping) this.applicationContext.getBean(RequestMappingHandlerMapping.class);
        /* 41 */
        Map<RequestMappingInfo, HandlerMethod> map = mapping.getHandlerMethods();

        /* 43 */
        map.keySet().forEach(info -> {
            HandlerMethod handlerMethod = (HandlerMethod) map.get(info);
            Anonymous method = (Anonymous) AnnotationUtils.findAnnotation(handlerMethod.getMethod(), Anonymous.class);
            Optional.<Anonymous>ofNullable(method).ifPresent(s ->{});
            Anonymous controller = (Anonymous) AnnotationUtils.findAnnotation(handlerMethod.getBeanType(), Anonymous.class);
            Optional.<Anonymous>ofNullable(controller).ifPresent((s ->{}));
        });
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        /* 61 */
        this.applicationContext = context;
    }


    public List<String> getUrls() {
        /* 66 */
        return this.urls;
    }


    public void setUrls(List<String> urls) {
        /* 71 */
        this.urls = urls;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\framework\config\properties\PermitAllUrlProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */