package com.requestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class HandlerMapping {

    static Map<String, Handler> url2HandlerMap = new HashMap<>();

    static {
        url2HandlerMap.put("tom", new Handler("tom", "com.requestMapping.Controller"));
        url2HandlerMap.put("jack", new Handler("jack", "com.requestMapping.Controller"));
    }

    public static Handler getHandler(String url) {
        return url2HandlerMap.get(url);
    }

}
