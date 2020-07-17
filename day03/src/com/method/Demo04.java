package com.method;

/*
    带有返回值的方法

    需求：定义一个方法，计算两个整数相加的和
 */
public class Demo04 {
    public static void main(String[] args) {
        int sum = getSum(10, 20);
        System.out.println(sum);
    }

    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}
