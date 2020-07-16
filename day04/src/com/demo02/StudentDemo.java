package com.demo02;

// 创建学生测试类
public class StudentDemo {
    // 测试类 main 方法
    public static void main(String[] args) {
        // 创建学生对象
        Student s = new Student();

        System.out.println(s.name + "," + s.age);

        s.name = "Tom";
        s.age = 12;

        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();
    }
}
