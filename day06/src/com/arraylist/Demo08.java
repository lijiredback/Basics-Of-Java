package com.arraylist;

import java.util.ArrayList;

/*
    需求：有如下字符串 ["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]
         将所有的元素按顺序存入 ArrayList，并遍历集合查看存储结果
 */
public class Demo08 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("aaa");
        arrayList.add("aaa");
        arrayList.add("ccc");
        arrayList.add("bbb");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
