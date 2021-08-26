package org.cxy.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoDoor {

    //  方法参数列表（or 参数包装对象）中的目标字段
    String key() default "";

    //预设拦截时返回值，是返回对象的 Json
    String returnJson() default "";

}
