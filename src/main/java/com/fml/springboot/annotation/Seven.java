package com.fml.springboot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})//用于表示注解用来描述类还是方法亦或是属性，根据参数的不同指定描述的对象类型
@Retention(RetentionPolicy.RUNTIME)//描述注解的生命周期
public @interface Seven {
    public String name() default "小黑";

    public String property() default "无属性";

    public String sex() default "男";
}
