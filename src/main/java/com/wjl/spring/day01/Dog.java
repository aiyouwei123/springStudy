package com.wjl.spring.day01;

public class Dog {
    private String name;
    private String sex;
    private int age;
    public Dog(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
