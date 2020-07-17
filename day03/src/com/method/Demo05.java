package com.method;

/*
    带返回值方法练习

    需求：设计一个方法，可以获取两个数的较大值，数据来自于参数
 */
public class Demo05 {
    public static void main(String[] args) {
        int result = getMax(50, 20);
        System.out.println(result);
    }

    public static int getMax(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
