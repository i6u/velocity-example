package com.witt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author witt
 * @fileName AnnotationElementDemo
 * @date 2018/6/3 23:39
 * <p>
 * @description 注解数据类型
 * @history <author>    <time>    <version>    <desc>
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Reference {
    boolean next() default false;
}

public @interface AnnotationElementDemo {

    //enum type
    enum Status {
        FIXED, NORMAL
    };

    //枚举类型声明
    Status status() default Status.FIXED;
    //注解嵌套
    Reference REFERENCE() default @Reference(next = true);

    boolean showSuppert() default false;

    String name () default "";

    Class<?> testCase() default Void.class;


}
