package com.wjl.spring.day02;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

    private String name;
    private String sex;
    private int age;
    private Cat cat;
    private List pet;
    private Map fimally;
    private Set friend;


    public List getPet() {
        return pet;
    }

    public void setPet(List pet) {
        this.pet = pet;
    }

    public Map getFimally() {
        return fimally;
    }

    public void setFimally(Map fimally) {
        this.fimally = fimally;
    }

    public Set getFriend() {
        return friend;
    }

    public void setFriend(Set friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                ", pet=" + pet +
                ", fimally=" + fimally +
                ", friend=" + friend +
                '}';
    }
}
