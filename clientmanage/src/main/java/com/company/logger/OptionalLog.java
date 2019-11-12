package com.company.logger;

import java.lang.annotation.*;
/**
 * <p>Title: SystemLog</p>  
 * <p>Description:自定义操作日志标签，模块名和方法名 </p>  
 * @author Saffichan
 * @date 2018-06-01 15:57
 */

@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OptionalLog {
 String modules() default ""; 
 String methods() default ""; 
}

