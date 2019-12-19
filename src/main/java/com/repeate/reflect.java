package com.repeate;

import com.log.Log;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by caoweiwei on 2019/12/17.
 */
public class reflect {

    public static void main(String[] args) {
       getAnnotationTest();

    }

    /**
     * 测试getAnnotationsByType 能不能获取到非repeatable的注解
     */
    private static void overrideTest(){
        try {
            Class clazz = Class.forName("com.repeate.Test");
            Method method = clazz.getMethod("schedule");
//            Log annotation = method.getAnnotation(Log.class);
//            System.out.println(annotation);
            Log[] annotationsByType = method.getAnnotationsByType(Log.class);
            System.out.println(annotationsByType.length);   //getAnnotationsByType可以获取到非repeatable的注解

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getDeclareAnnotationTest(){
        Class clazz = null;
        try {
            clazz = Class.forName("com.repeate.Test");
            Method method = clazz.getMethod("schedule");
            Annotation annotation = clazz.getDeclaredAnnotation(Inherited.class);
//            Annotation annotation = clazz.getAnnotation(Inherited.class);

            System.out.println(annotation);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private static void getAnnotationTest(){
        try {
            Class clazz = Class.forName("com.repeate.Test");
            Method method = clazz.getMethod("schedule");
            if (null != method) {

                Sechdule annotation = method.getAnnotation(Sechdule.class);
                if(annotation!=null){
                    System.out.println(annotation.hour());
                }

//                Annotation[] annotations = method.getAnnotations();
//                Sechdule[] annotationsByType = method.getAnnotationsByType(Sechdule.class);
//                if(null != annotationsByType){
//                    for(Sechdule sechdule : annotationsByType){
//                        if (null != sechdule) {
//                            System.out.println(sechdule.hour());
//                        }
//                    }
//                }

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
