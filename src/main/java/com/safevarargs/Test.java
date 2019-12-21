package com.safevarargs;

import java.util.Arrays;
import java.util.List;

/**
 * Created by caoweiwei on 2019/12/17.
 */
public class Test {

//    @SafeVarargs
    @SuppressWarnings("all")
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
        System.out.println(s);
    }

}
