package com.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by caoweiwei on 2019/12/16.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE_PARAMETER)
public @interface TypeParameterAnnotation {

}