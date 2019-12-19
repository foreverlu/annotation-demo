package com.classpreamble;

import java.lang.annotation.Documented;

/**
 * Created by caoweiwei on 2019/12/16.
 */
@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Note use of array
    String[] reviewers();
}
