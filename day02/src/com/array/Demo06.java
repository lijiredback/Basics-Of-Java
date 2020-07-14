package com.array;

import java.util.Scanner;

/*
    查找：

    需求：已知一个数组 arr = { 19, 28, 37, 46, 50 }
         键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出
 */
public class Demo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个数：");

        int number = sc.nextInt();

        int[] arr = { 19, 28, 37, 46, 50 };

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
