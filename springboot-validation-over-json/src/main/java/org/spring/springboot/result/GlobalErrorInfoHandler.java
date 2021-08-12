package org.spring.springboot.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一错误码异常处理
 * <p>
 * Created by bysocket on 14/03/2017.
 * <p/>
 * 使用 @RestControllerAdvice 是 @ControllerAdvice 和 @ResponseBody 的语义结合。
 * 是控制器增强，直接返回对象。这里用于统一拦截异常，然后返回错误码对象体
 * <p/>
 * 使用 @ResponseBody 作用：
 * 该注解用于将 Controller 的方法返回的对象，通过适当的 HttpMessageConverter 转换为指定格式后，
 * 写入到 Response 对象的 body 数据区。
 */
@RestControllerAdvice

public class GlobalErrorInfoHandler {
    /**
     * 使用 @ExceptionHandler 注解，标记了使用 errorHandlerOverJson() 方法来处理
     * GlobalErrorInfoException 异常。
     */
    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request, GlobalErrorInfoException exception) {
        ErrorInfoInterface errorInfo = exception.getErrorInfo();
        ResultBody result = new ResultBody(errorInfo);
        return result;
    }
}
