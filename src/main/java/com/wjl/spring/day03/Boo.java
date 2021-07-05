package com.wjl.spring.day03;

public class Boo {
    private Aoo aoo;

    public Aoo getAoo() {
        return aoo;
    }

    public void setAoo(Aoo aoo) {
        this.aoo = aoo;
    }

    public void printAoo(){
        System.out.println("Aoo Bean:"+getAoo());
    }
}
