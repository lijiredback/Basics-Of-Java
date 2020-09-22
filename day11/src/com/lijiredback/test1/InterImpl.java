package com.lijiredback.test1;

// 不可以多继承，但可以多实现
public class InterImpl implements Inter, InterA {
    @Override
    public void study() {
        System.out.println("我是实现类中的 study 方法");
    }

    @Override
    public void printA() {

    }

    @Override
    public void printB() {

    }
}
