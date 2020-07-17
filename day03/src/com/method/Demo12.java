package com.method;

/*
    需求：定义一个方法，该方法能够找出三个整数中的最大值并返回
 */
public class Demo12 {
    public static void main(String[] args) {
        int a = 22;
        int b = 20;
        int c = 10;

        int result = getMax(a, b, c);
        System.out.println(result);
    }

    public static int getMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }
}
