package com.wjl.spring.day03;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class LogMethodReplacer implements MethodReplacer {
    private static final transient Log logger = LogFactory.getLog(LogMethodReplacer.class);

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        logger.info("方法执行之前["+method.getName()+"] 在类 ["+o.getClass().getName()+"]中.");
        System.out.println("sorry,We will do nothing this time.");
        logger.info("方法执行完成["+method.getName()+"] 在类 ["+o.getClass().getName()+"]中.");
        return null;
    }
}
