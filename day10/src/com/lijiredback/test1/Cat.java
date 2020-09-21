package com.lijiredback.test1;

public class Cat extends Animal {
    // 继承了抽象类，必须重写抽象方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
