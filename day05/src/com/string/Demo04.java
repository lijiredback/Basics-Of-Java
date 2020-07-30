package com.string;

/*
    案例：统计字符次数

    需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
 */

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        // 2. 初始化统计变量
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        // 3. 遍历字符串 toCharArray 方法
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'a') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        // 4. 输出打印结果
        System.out.println("大写字母字符:" + bigCount);
        System.out.println("小写字母字符:" + smallCount);
        System.out.println("数字字符:" + numCount);
    }
}
