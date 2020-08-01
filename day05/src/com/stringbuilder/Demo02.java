package com.stringbuilder;

/*
    StringBuilder 常用成员方法

        append() 添加
        reverse()
 */
public class Demo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(123).append("abc").append(true);
        System.out.println("反转前---------------- " + sb);
        sb.reverse();
        System.out.println("反转后---------------- " + sb);
        System.out.println("sb中字符串的个数 " + sb.length());
    }
}
