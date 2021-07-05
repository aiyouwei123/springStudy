package com.wjl.spring.day03;
import org.joda.time.DateTime;
import org.springframework.beans.factory.FactoryBean;

/**
 * getObject()方法会返回该FactoryBean“生产”的对象实例，我们需要实现该方法以给出自己
 * 的对象实例化逻辑；getObjectType()方法仅返回getObject()方法所返回的对象的类型，如果预先
 * 无法确定，则返回null；isSingleton()方法返回结果用于表明，工厂方法（getObject()）所“生
 * 产”的对象是否要以singleton形式存在于容器中。如果以singleton形式存在，则返回true，否则返回false；
 * 如果我们想每次得到的日期都是第二天,如下代码实现
 */



public class NextDayDateFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new DateTime().plusDays(1);
    }

    @Override
    public Class<?> getObjectType() {
        return DateTime.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
