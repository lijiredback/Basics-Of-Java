package com.lijiredback.test1;

public abstract class Animal {
    public void drink() {
        System.out.println("喝水");
    }

//    public void eat() {
//        System.out.println("吃饭");
//        // 但是猫吃鱼、狗吃肉，所以这里不知道写什么
//        // 需要定义为抽象类
//    }

    public abstract void eat();
}
