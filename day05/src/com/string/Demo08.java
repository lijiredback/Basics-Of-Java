package com.string;

/*
    案例：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 */


import java.util.Scanner;

public class Demo08 {
    public static void main(String[] args) {
        /* 实现1
        // 1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        // 2. 转字符数组
        char[] chars = s.toCharArray();
        // 3. 循环遍历打印
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        */


        // 实现2
        // 1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();
        // 2. 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
