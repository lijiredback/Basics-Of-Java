package com.lijiredback.test3;

// 继承：成员方法的访问特点
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show(); // 父类不是私有的，先找子类的方法，再找父类的方法

        zi.method();
    }
}
