package com.test;

import com.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 创建集合对象
        ArrayList<Student> arrayList = new ArrayList<>();

        lo: while(true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");

            String choice = sc.next();

            switch (choice) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent(arrayList);
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    // System.out.println("查看学生");
                    queryStudents(arrayList);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }



    // 添加学生
    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号：");
        String sid = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();

        Student stu = new Student(sid, name, age, birthday);

        arrayList.add(stu);
    }

    // 查看学生
    public static void queryStudents(ArrayList<Student> arrayList) {
        // 判断集合中是否存在数据
        if (arrayList.size() == 0) {
            System.out.println("无信息，请添加后重新查询");
            return;
        }
        // 存在数据，展示表头信息
        System.out.println("学号\t姓名\t\t年龄\t生日");
        // 遍历集合，打印学生信息
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }
}
