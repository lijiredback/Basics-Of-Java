package com.array;

/*
    数组的定义格式：
        1. 数据类型[] 数组名 = 创建数组容器
        2. 数据类型 数组名[]

    动态初始化：
        数据类型[] 变量名 = new 数据类型[数组长度]
        int[] arr = new int[3];
 */

public class Demo01 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int arr2[] = new int[5];

        System.out.println(arr1); // [I@61bbe9ba    内存地址
        System.out.println(arr2); // [I@610455d6    内存地址
    }
}
