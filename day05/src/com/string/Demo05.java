package com.string;

/*
    案例：手机号屏蔽

    需求：以字符串的形式从键盘接收一个手机号，将中间四位号码屏蔽
    最终效果：156****1234
 */

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        // 1. 键盘录入手机号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String s = sc.nextLine();
        // 2. 截取
        String start = s.substring(0, 3);
        String end = s.substring(7);
        // 3. 输出
        System.out.println(start + "****" + end);
    }
}
