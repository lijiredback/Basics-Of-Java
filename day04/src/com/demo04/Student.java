package com.demo04;

/*
    this 关键字
 */
public class Student {
    private String name;  // private 修饰，只能在本类中访问
    private int age;      // private 修饰，只能在本类中访问

    // 要想被外界访问，必须提供相应的 get set 方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "..." + age);
    }
}
