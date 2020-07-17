package com.method;

/*
    案例：获取数组中的最大值

    需求：设计一个方法用于获取数组中元素的最大值
 */
public class Demo10 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };

        int result = getMax(arr);

        System.out.println(result);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
