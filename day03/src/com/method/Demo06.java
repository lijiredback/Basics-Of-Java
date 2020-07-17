package com.method;

/*
    方法重载练习

    需求：使用方法重载的思想，设计  比较  两个整数是否相同的方法，兼容全整数类型（byte short int long）
 */
public class Demo06 {
    public static void main(String[] args) {
        boolean result = isEqual(1L, 1L);
        System.out.println(result);
    }

    public static boolean isEqual(byte num1, byte num2) {
        return num1 == num2;
    }

    public static boolean isEqual(short num1, short num2) {
        return num1 == num2;
    }

    public static boolean isEqual(int num1, int num2) {
        return num1 == num2;
    }

    public static boolean isEqual(long num1, long num2) {
        return num1 == num2;
    }
}
