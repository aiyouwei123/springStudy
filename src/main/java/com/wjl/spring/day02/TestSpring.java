package com.wjl.spring.day02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        DemoProperties demoProperties = context.getBean("demoProperties",DemoProperties.class);
        System.out.println(demoProperties);
    }

    @Test
    public void Test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
    }

    @Test
    public void Test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        Foo foo = context.getBean("fooBean",Foo.class);
        System.out.println(foo);
    }
}
