package com.target;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * Created by caoweiwei on 2019/12/16.
 */
                          //1. 继承  /  实现
public class Test extends @TypeUseAnnotation Demo{

    //2 new 对象时
    @TypeUseAnnotation
    Demo demo = new @TypeUseAnnotation Demo();

    //3
    List<@TypeUseAnnotation String> list;

    //List<@TypeParameterAnnotation Integer> a;


    Demo demo1 = new Demo();


    public void test(@TypeUseAnnotation Demo demo) throws @TypeUseAnnotation Exception{

        Collection<String> c = new ArrayList<>();

    }



}
