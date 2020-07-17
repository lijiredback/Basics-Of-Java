package com.method;

/*
    方法参数传递为引用数据类型： 传入方法中的 是 内存地址
 */

public class Demo08 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        System.out.println("调用 change 方法前" + arr[1]); // 20

        change(arr);

        System.out.println("调用 change 方法后" + arr[1]); // 200
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
