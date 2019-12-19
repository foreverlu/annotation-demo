package com.classpreamble;

import java.util.Arrays;
import java.util.List;

/**
 * Created by caoweiwei on 2019/12/16.
 */
@ClassPreamble (
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class SomeClass {


//    @SafeVarargs
    static void m(List<String>... stringLists) {
        Object[] array = stringLists;
        List<Integer> tmpList = Arrays.asList(42);
        array[0] = tmpList; // Semantically invalid, but compiles without warnings
        String s = stringLists[0].get(0); // Oh no, ClassCastException at runtime!
    }
}
