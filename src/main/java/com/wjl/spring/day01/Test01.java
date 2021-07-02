package com.wjl.spring.day01;


import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public  void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Dog dog = context.getBean("dog",Dog.class);
        System.out.println(dog);
    }

    @Test
    public  void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        Cat cat = context.getBean("cat",Cat.class);
        System.out.println(cat);
    }
}
