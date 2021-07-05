package com.wjl.spring.day03;

import com.wjl.spring.day02.Cat;

public class StaticInterfaceFactory {
  /*  public static Aoo getInstance(Cat cat){
        return new Aoo(cat);
    }*/
    public static Aoo getInstance(){
        return new Aoo();
    }
}
