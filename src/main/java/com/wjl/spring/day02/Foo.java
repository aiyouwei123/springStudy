package com.wjl.spring.day02;

public class Foo {
    private Cat oneCat;

    public Cat getOneCat() {
        return oneCat;
    }

    public void setOneCat(Cat oneCat) {
        this.oneCat = oneCat;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "oneCat=" + oneCat +
                '}';
    }
}
