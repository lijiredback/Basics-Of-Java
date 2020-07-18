package com.demo10;

/*
    标准类的制作：
        1. 成员变量
            • 使用 private 修饰
        2. 构造方法
            • 提供一个无参构造方法
            • 提供一个带多个参数的构造方法
        3. 成员方法
            • 提供每一个成员变量对应的 setXxx()/getXxx()
            • 提供一个显示对象信息的 show()
        4. 创建对象并为其成员变量赋值的两种方式
            • 无参构造方法创建对象后，使用 setXxx() 赋值
            • 使用带参构造方法直接创建带有属性的对象



     当前这种 私有成员变量，提供有参无参构造方法，及 getter setter 方法，这种类叫封装数据的类
     JavaBean类：封装数据的
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + "..." + age);
    }

}
