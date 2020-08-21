package com.lijiredback.test2;

// 继承：访问变量
public class Zi extends Fu {

    int a = 20; // 子类和父类，出现了重名的成员变量

    public void method() {
        int a = 30; // 就近原则

        System.out.println(a);

        // 需求1：打印本类成员变量 20
        System.out.println(this.a);

        // 需求2：打印父类成员变量 10
        System.out.println(super.a);
    }
}
