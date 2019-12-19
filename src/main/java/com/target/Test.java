package com.target;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * Created by caoweiwei on 2019/12/16.
 */
public class Test extends @TypeUseAnnotation Demo{

    Demo demo = new @TypeUseAnnotation Demo();
    List<@TypeUseAnnotation String> list;

    //List<@TypeParameterAnnotation Integer> a;


    Demo demo1 = new Demo();


    public void test( Demo demo) throws @TypeUseAnnotation Exception{
        Collection<String> c = new ArrayList<>();

    }



}
