package com.requestMapping;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class HandlerMapping {

    static Map<String, Handler> url2HandlerMap = new HashMap<>();

    static {
//        url2HandlerMap.put("tom", new Handler("tom", "com.requestMapping.MyController"));
//        url2HandlerMap.put("jack", new Handler("jack", "com.requestMapping.MyController"));
        initUrl2HandlerMap();
    }

    public static Handler getHandler(String url) {
        return url2HandlerMap.get(url);
    }

    private static void initUrl2HandlerMap(){
        try {
            Class clazz = Class.forName("com.requestMapping.MyController");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method m : methods){
                if(m.isAnnotationPresent(RequestMapping.class)){
                    RequestMapping requestMapping = m.getAnnotation(RequestMapping.class);
                    String url = requestMapping.value();
                    url2HandlerMap.put(url,new Handler(m.getName(),"com.requestMapping.MyController"));
                }
            }
        } catch (ClassNotFoundException e) {
        }

    }

}
