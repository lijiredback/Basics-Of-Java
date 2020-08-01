package com.arraylist;

import com.domain.Teacher;

import java.util.ArrayList;

/*
    需求：
        定义 Teacher 类，属性包含姓名和专业
        将若干教师对象存入 ArrayList 集合中，并遍历打印教室信息

        姓名：赵老师，专业：javaee
        姓名：钱老师，专业：javaee
        姓名：孙老师，专业：php
        姓名：李老师，专业：python

 */
public class Demo09 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("赵老师", "javaee");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");

        ArrayList<Teacher> arrayList = new ArrayList<>();
        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        arrayList.add(t4);

        for (int i = 0; i < arrayList.size(); i++) {
            Teacher teacher = arrayList.get(i);
            System.out.println(teacher.getName() + "..." + teacher.getMajor());
        }
    }
}
