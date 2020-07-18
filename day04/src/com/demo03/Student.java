package com.demo03;

/*
    练习使用 private 修饰符，修饰成员

    提供相应的 get set 方法
 */
public class Student {
    private String name;  // private 修饰，只能在本类中访问
    private int age;      // private 修饰，只能在本类中访问

    // 要想被外界访问，必须提供相应的 get set 方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "..." + age);
    }
}
