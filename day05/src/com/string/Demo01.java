package com.string;

/*
    字符串内容比较 equals
 */
public class Demo01 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s2)); // true 忽略大小写
    }
}
