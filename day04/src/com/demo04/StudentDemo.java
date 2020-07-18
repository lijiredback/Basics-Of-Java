package com.demo04;

import com.demo03.Student;

// 测试类
public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        com.demo03.Student stu = new Student();

        stu.setName("张三");
        stu.setAge(23);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        stu.show();
    }
}
