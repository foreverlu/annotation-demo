package com.log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * Created by caoweiwei on 2019/12/14.
 */
@Component
public class LogTest {

    @Log()
    public String logTest(String in) {
        doSomething();
        return DigestUtils.md5DigestAsHex(in.getBytes());
    }


    public void doSomething() {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(100000000));
        }
        Collections.sort(list);
    }

}
