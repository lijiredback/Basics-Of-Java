package com.lijiredback.test2;

public class InterImpl implements Inter {
    public InterImpl() {
        super(); // extends Object, 接口中没有构造方法
    }

    public void method() {
        // NUM = 20; // 不能修改，接口中的成员变量，默认被 final 修饰
        System.out.println(NUM); // 10
    }
}
