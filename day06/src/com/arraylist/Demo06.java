package com.arraylist;

import java.util.ArrayList;

/*
    案例：集合删除元素

    需求：创建一个存储 String 的集合，内部存储（test, 张三, 李四, test, test） 字符串
         删除所有的 test 字符串，删除后，将集合剩余元素打印在控制台
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("test");
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("test");
        arrayList.add("test");

        for (int i = 0; i < arrayList.size(); i++) {
            if ("test".equals(arrayList.get(i))) {
                arrayList.remove(i);
                i--; // 非常重要
            }
        }

        System.out.println(arrayList);
    }
}
