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
                    // System.out.println("删除学生");
                    deleteStudent(arrayList);
                    break;
                case "3":
                    // System.out.println("修改学生");
                    updateStudent(arrayList);
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

    // 修改学生信息
    public static void updateStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要修改的学生 id:");

        String updateSid = sc.next();

        int result = getIndex(arrayList, updateSid);

        if (result == -1) {
            System.out.println("学生不存在，请重新输入");
        } else {
            // 接收新的学生信息
            System.out.println("请输入姓名：");

            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入生日：");
            String birthday = sc.next();

            // 封装为新的学生对象
            Student stu = new Student(updateSid, name, age, birthday);
            // 调用集合的 set 方法，完成修改
            arrayList.set(result, stu);
            System.out.println("修改成功");
        }
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要删除的学号");

        String deleteSid = sc.next();

        int result = getIndex(arrayList, deleteSid);

        if (result == -1) {
            System.out.println("没有信息，请重新输入");
        } else {
            arrayList.remove(result);
            System.out.println("删除成功！");
        }
    }


    // 添加学生
    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true) {
            System.out.println("请输入学号：");
            sid = sc.next();

            int result = getIndex(arrayList, sid);

            if (result == -1) {
                // sid 不存在
                break;
            } else {
                System.out.println("输入的学号已经存在，请重新输入");
            }
        }
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

    // 学生id
    public static int getIndex(ArrayList<Student> arrayList, String sid) {
        // 假设传入的学号，在集合中不存在
        int index = -1;
        // 遍历学生对象，获取每一个学生对象，进行查找
        for (int i = 0; i < arrayList.size(); i++) {
            Student stu = arrayList.get(i);
            // 获取每一个学生对象的 id
            String id = stu.getSid();
            // 比对传入的学号
            if (id.equals(sid)) {
                index = i;
            }
        }
        return index;
    }
}
