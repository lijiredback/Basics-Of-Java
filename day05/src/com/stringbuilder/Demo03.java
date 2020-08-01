package com.stringbuilder;
/*
    案例：对称字符串

    需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是

            对称字符串：123321、111
            非对称字符串：123123
 */

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对称字符串：");
        String str = sc.nextLine();
        // 逻辑
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverseStr = sb.toString();
        // 判断
        if (str.equals(reverseStr)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
