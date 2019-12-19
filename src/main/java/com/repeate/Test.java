package com.repeate;

import com.log.Log;
import java.lang.annotation.Documented;

/**
 * Created by caoweiwei on 2019/12/17.
 */
public class Test extends parent {

    @Sechdule(hour = 0)
    @Sechdule(hour = 1)
    @Sechdule(hour = 2)
    @Override
    @Log
    public void schedule(){
        System.out.println("schedule");
    }

}
