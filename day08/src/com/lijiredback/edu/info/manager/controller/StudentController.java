package com.lijiredback.edu.info.manager.controller;

import com.lijiredback.edu.info.manager.domain.Student;
import com.lijiredback.edu.info.manager.service.StudentService;

import java.util.Scanner;

// Controller：与用户打交道，命令行输入、打印等
public class StudentController {
    // 开启学生管理系统 并展示菜单
    public void start() {
        lo: while(true) {
            System.out.println("--------欢迎来到<学生>管理系统--------");
            System.out.println("请输入您的选择：1. 添加学生 2. 删除学生 3. 修改学生 4. 查看学生 5. 退出");

            Scanner sc = new Scanner(System.in);
            String choice = sc.next();

            switch (choice) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看学生");
                    break;
                case "5":
                    System.out.println("感谢使用学生管理信息系统");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    // 添加学生
    public void addStudent() {
        StudentService studentService = new StudentService();
        String id;

        // 1. 键盘接收学生信息
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("请输入学生 id");
            id = sc.next();

            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();

        System.out.println("请输入学生年龄");
        String age = sc.next();

        System.out.println("请输入学生生日");
        String birthday = sc.next();

        // 2. 将学生信息封装为学生对象
        Student stu = new Student(id, name, age, birthday);

        // 3. 将学生对象，传递给 StudentService 中的 addStudent 方法
        boolean result = studentService.addStudent(stu);

        // 4. 根据返回的 boolean 结果，在控制台打印成功/失败
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
