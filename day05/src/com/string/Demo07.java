package com.string;

/*
    案例：切割字符串

    需求：以字符串的形式从键盘录入学生信息
        如："张三, 23"
        从该字符串中切割出有效数据封装为 Student 学生对象
 */

import com.domain.Student;

import javax.swing.undo.AbstractUndoableEdit;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息");
        String stuInfo = sc.nextLine();

        // 逗号切割 "张三, 23"
        String[] sArr = stuInfo.split(",");

        // System.out.println(sArr[0]);
        // System.out.println(sArr[1]);

        // 封装对象
        Student stu = new Student(sArr[0], sArr[1]);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
    }
}
