package com.arraylist;

/*
    案例：存储学生对象并遍历

    需求：创建一个存储学生对象的集合，存储 3 个学生对象，使用程序实现在控制台遍历该集合
         学生的姓名和年龄来自于键盘录入
 */

import com.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();


        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();

        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getName() + "..." + arrayList.get(i).getAge());
        }

    }

    private static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        Student stu = new Student(name, age);
        return stu;
    }
}
