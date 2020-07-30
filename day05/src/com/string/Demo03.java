package com.string;

/*
    案例：遍历字符串

    需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串

    思路：
        1. 键盘录入一个字符串，用 Scanner 实现
        2. 遍历字符串，首先要能获取字符串中的每一个字符
            public char charAt(int index): 返回指定索引处的 char 值
*/

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
