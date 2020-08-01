package com.stringbuilder;

// StringBuilder 构造方法
public class Demo01 {
    public static void main(String[] args) {
        // 空参构造, 创建空白可变字符串对象
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        // 带参
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
    }
}
