package com.array;

/*
    数组元素求和

    需求：键盘录入 5 个整数，存储到数组中，并对数组求和
 */

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int[] arr = new int[5];

        System.out.println("请输入 5 个整数：");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("5 个数的和为：" + sum);
    }
}
