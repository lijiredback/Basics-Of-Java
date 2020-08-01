package com.string;

import java.util.Scanner;

/*
    需求：请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个
 */
public class Demo09 {
    public static void main(String[] args) {
        // 1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s = sc.nextLine();

        // 2. 初始化统计变量
        int numCount = 0;
        int alphaCount = 0;

        // 3. 转换字符数组并遍历
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                numCount++;
            } else if ((chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= 'a' && chars[i] <= 'z')) {
                alphaCount++;
            }
        }

        // 4. 输出结果
        System.out.println("数字出现的次数：" + numCount);
        System.out.println("字母出现的次数：" + alphaCount);
    }
}
