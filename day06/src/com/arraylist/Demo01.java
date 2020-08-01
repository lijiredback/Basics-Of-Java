package com.arraylist;

import java.util.ArrayList;

/*
    ArrayList 构造方法：
        ArrayList() 构造一个初始容量为 10 的空列表

    <>: 泛型：对集合容器存储的数据类型进行限制
    集合容器如果没有加入 <>，就可以存储任意数据类型
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add("444");
        arrayList.add("555");
        arrayList.add(0, "666");
        // arrayList.add(555); // error
        System.out.println(arrayList);
    }
}
