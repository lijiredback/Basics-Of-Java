package com.arraylist;

import java.util.ArrayList;

/*
    ArrayList 常见成员方法
        remove
        set()
        get()
        size()
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("abc");
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");
        arrayList.add("444");
        arrayList.add("555");

        // remove()
        boolean b1 = arrayList.remove("abc");
        boolean b2 = arrayList.remove("xxx");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(arrayList);


        String s = arrayList.remove(0);
        System.out.println(s);
        System.out.println(arrayList);

        // set()
        String s1 = arrayList.set(0, "666");
        System.out.println(s1);
        System.out.println(arrayList);

        // get()
        String s2 = arrayList.get(0);
        System.out.println(s2);
        System.out.println(arrayList);

        // size()
        System.out.println(arrayList.size());
    }
}
