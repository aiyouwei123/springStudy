package com.wjl.spring.day03;

import com.wjl.spring.day02.DemoProperties;
import com.wjl.spring.day02.Foo;
import com.wjl.spring.day02.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    /**
     * 虽然Aoo拥有prototype类型的scope，但当容器将一个Aoo的实例注入
     * Boo之后，Boo就会一直持有这个Aoo实例的引用。虽然每
     * 次输出都调用了getAoo方法并返回了Aoo 的实例，但实际上每次返回的都是
     * Boo持有的容器第一次注入的实例。
     * 第一个实例注入后，Boo再也没有重新向容器申请新的实例。所以，容器也不会重新为其注入新的
     * Aoo类型的实例。
     */
    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application5.xml");
        Boo boo = context.getBean("boo",Boo.class);
        boo.printAoo();
        boo.printAoo();
    }
}
