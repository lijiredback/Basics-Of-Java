package com.array;

import com.domain.Student;

/*
    需求：将(张三,23)(李四,24)(王五,25)封装为 3 个学生对象并存入数组
         随后遍历数组，将学生信息输出在控制台

    思路：
        1. 定义学生类，用于封装数据
        2. 动态初始化长度为 3 的数组，类型为 Student
        3. 根据需求创建 3 个学生对象
        4. 将学生对象存入数组
        5. 遍历数组，取出每一个学生对象
        6. 调用对象的 getXxx 方法取出学生信息，并输出在控制台
 */
public class Demo01 {
    public static void main(String[] args) {
        // 动态初始化
        Student[] arr = new Student[3];
        // 创建 3 个学生对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        // 将学生对象存入数组
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + "..." + arr[i].getAge());
        }
    }
}
