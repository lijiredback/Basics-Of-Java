package com.method;

/*
    案例：获取数组最大值和最小值

    需求：设计一个方法，该方法能够同时获取数组的最大值和最小值

    return 语句只能带回一个结果
 */
public class Demo11 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };

        int[] maxAndMin = getMaxAndMin(arr);

        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);
    }

    public static int[] getMaxAndMin(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int[] maxAndMin = { max, min };
        return maxAndMin;
    }
}
