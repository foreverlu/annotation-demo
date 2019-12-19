package com.requestMapping;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * Created by caoweiwei on 2019/12/14.
 */
public class DispatchServlet {

    public Object dispatch(HttpRequest request){
        String url = request.getUrl();
        Handler handler =  HandlerMapping.getHandler(url);
        if(handler==null){
            System.out.println("未找到");
            return null;
        }

        String method = handler.getMethod();
        String controller = handler.getController();
        try {
            Class clazz = Class.forName(controller);
            Method method1 = clazz.getMethod(method);
            Object invoke = method1.invoke(clazz.newInstance());
            return invoke;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
