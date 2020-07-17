package com.method;

/*
    方法参数传递为基本数据类型： 传入方法中的 是 具体的数值
 */
public class Demo07 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用 change 方法前:" + number); // 100

        change(number);

        System.out.println("调用 change 方法后:" + number); // 100
    }

    public static void change(int number) {
        number = 200;
    }
}
