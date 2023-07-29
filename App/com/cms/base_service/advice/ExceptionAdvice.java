package com.cms.base_service.advice;

import com.cms.base_service.common.model.Constants;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.exception.AuthorizationException;
import com.cms.base_service.exception.BusinessException;
import io.jsonwebtoken.MalformedJwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class ExceptionAdvice {
    /*  21 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.advice.ExceptionAdvice.class);


    @ExceptionHandler({BusinessException.class})
    public RestResult handleBusinessException(BusinessException e) {
        /*  32 */
        return RestResult.fail().setMsg(e.getMessage()).setCode(Constants.BUSSINESS_EXCEPTION_CODE);
    }


    @ExceptionHandler({MalformedJwtException.class})
    public RestResult handleBusinessException(MalformedJwtException e) {
        /*  43 */
        return RestResult.fail().setMsg(e.getMessage()).setCode(Constants.LOGIN_EXCEPTION_CODE);
    }


    @ExceptionHandler({AuthorizationException.class})
    public RestResult handleAuthorizationException(AuthorizationException e) {
        /*  56 */
        return RestResult.fail().setMsg(e.getMessage()).setCode(Constants.LOGIN_EXCEPTION_CODE);
    }


    @ExceptionHandler({MissingServletRequestParameterException.class})
    public RestResult handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        /*  64 */
        log.error("请求参数缺失:{}" + e);
        /*  65 */
        return RestResult.fail().setCode(Constants.BUSSINESS_EXCEPTION_CODE).setMsg("请求参数缺失");
    }


    @ExceptionHandler({NoHandlerFoundException.class})
    public RestResult noHandlerFoundException(NoHandlerFoundException e) {
        /*  73 */
        log.error("资源未找到:{}" + e);
        /*  74 */
        return RestResult.fail().setCode(Constants.BUSSINESS_EXCEPTION_CODE).setMsg("资源未找到");
    }


    public RestResult handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        /*  82 */
        log.error("请求方式不支持:{}" + e);
        /*  83 */
        return RestResult.fail().setCode(Constants.BUSSINESS_EXCEPTION_CODE).setMsg("请求方式不支持");
    }


    @ExceptionHandler({HttpMediaTypeNotSupportedException.class})
    public RestResult handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        /*  91 */
        log.error("不支持当前媒体类型:{}" + e);
        /*  92 */
        return RestResult.fail().setCode(Constants.BUSSINESS_EXCEPTION_CODE).setMsg("不支持当前媒体类型");
    }


    @ExceptionHandler({Exception.class})
    public RestResult defaultErrorHandler(Exception e) {
        /* 104 */
        log.error("服务器出错啦...错误原因>>>{}", e);
        /* 105 */
        return RestResult.fail().setCode(Constants.BUSSINESS_EXCEPTION_CODE).setMsg("服务器出错啦,请稍后再试" + (StringUtils.isNotEmpty(e.getMessage()) ? e.getMessage() : ""));
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\advice\ExceptionAdvice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */