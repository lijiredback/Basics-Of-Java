package com.arraylist;

import java.util.ArrayList;

/*
    案例：存储字符串并遍历

    需求：创建一个存储字符串的集合，存储 3 个字符串元素，使用程序实现在控制台遍历该集合
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
