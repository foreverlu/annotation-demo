package com.log;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by caoweiwei on 2019/12/14.
 */

public class LogDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        LogTest logTest = ac.getBean(LogTest.class);
        String res = logTest.logTest("password");
        System.out.println(res);

    }




}
