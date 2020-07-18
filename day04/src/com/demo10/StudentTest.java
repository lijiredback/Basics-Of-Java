package com.demo10;

public class StudentTest {
    public static void main(String[] args) {
        // 1 通过无参构造方法 赋值

        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(22);
        s1.show();

        Student s2 = new Student("李四", 24);
        s2.show();
    }
}
