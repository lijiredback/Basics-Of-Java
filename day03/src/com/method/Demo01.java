package com.method;

/*
    需求：设计一个方法，方法中定义一个变量

         判断这个变量是奇数还是偶数，并在 main 方法中调用该方法
 */
public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int num = 11;

        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
