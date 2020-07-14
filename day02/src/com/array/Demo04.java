package com.array;

/*
    获取数组中的最大值
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 98, 73, 60 };
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
