package com.arraylist;

import com.domain.Student;

import java.util.ArrayList;

/*
    案例：存储学生对象并遍历

    需求：创建一个存储学生对象的集合，存储 3 个学生对象，使用程序实现在控制台遍历该集合
 */
public class Demo04 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName() + "..." + arrayList.get(i).getAge());
        }
    }
}
