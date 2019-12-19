package com.repeate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by caoweiwei on 2019/12/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(Schedules.class)   //Schedules 为存储重复注释的容器注释类型
public @interface Sechdule {

    String dayOfMonth() default "first";

    String dayOfWeek() default "Mon";

    int hour() default 12;
}
