package com.fml.springboot.util;

import com.fml.springboot.annotation.Seven;
import com.fml.springboot.domain.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
注解处理器
 */
public class CatInfoUtil {
    public static void getCatInfo(Class<?> clazz) {

        Field[] fields = clazz.getDeclaredFields();
        Method[] methods = clazz.getDeclaredMethods();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Seven.class)) {//找到有Seven注解的成员变量
                Seven annotation = field.getAnnotation(Seven.class);
                System.out.println("猫名字：" + annotation.name()
                        + ", 猫性别：" + annotation.sex());
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(Seven.class)) {
                Seven annotation = method.getAnnotation(Seven.class);
                System.out.println("猫的特点是：" + annotation.property());
            }
        }
    }


    public static void main(String[] args) {
        CatInfoUtil.getCatInfo(Cat.class);
    }
}
