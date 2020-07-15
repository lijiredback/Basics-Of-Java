package com.array;

import java.util.Scanner;

/*
    案例：评委打分

    需求：在编程竞赛中，有 6 个评委为参赛的选手打分，分数为 0 - 100 的整数分
         选手的最后得分为：去掉一个最高分和一个最低分后的 4 个评委的平均值（不考虑小数部分）
 */
public class Demo07 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");

            int score = sc.nextInt();

            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("您的输入有误");
                i--;
            }
        }

        // 最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = (sum - max - min) / 4;
        System.out.println("平均分为：" + avg);
    }
}
