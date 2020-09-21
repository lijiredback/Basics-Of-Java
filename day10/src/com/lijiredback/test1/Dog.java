package com.lijiredback.test1;

public class Dog extends Animal {
    // 继承了抽象类，必须重写抽象方法

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
