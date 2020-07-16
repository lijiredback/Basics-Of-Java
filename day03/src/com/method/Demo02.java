package com.method;


/*
    需求：设计一个方法，给方法传递一个变量

         判断这个变量是奇数还是偶数，并在 main 方法中调用该方法
 */
public class Demo02 {
    public static void main(String[] args) {
        isEvenNumber(11);
        isEvenNumber(10);
    }

    public static void isEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
