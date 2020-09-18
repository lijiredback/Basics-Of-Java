package com.lijiredback.constructor;

// 如果父类中没有空参构造方法 怎么办
public class Test2 {
    public static void main(String[] args) {

    }
}

class Fu {
    int age;

    // 带参构造方法
    public Fu(int age) {
        this.age = age;
    }
}

class Zi extends Fu {
    public Zi(int age) {
        // 只能手动调用有参构造
        super(age);
    }
}
