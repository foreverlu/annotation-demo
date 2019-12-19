package com.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by caoweiwei on 2019/12/14.
 */
@Component
@Aspect
public class LogAspect {

    private static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("@annotation(com.log.Log)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object printLog(ProceedingJoinPoint jp) {

        long t1 = System.currentTimeMillis();

        Object[] args = jp.getArgs();
        logger.info("args:{}", args);
        Object res = null;
        try {
            res = jp.proceed();
            if (null != res) {
                logger.info("result:{}", res);
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        long t2 = System.currentTimeMillis();
        logger.info("method cost: {} ms", (t2 - t1));
        return res;
    }


}
