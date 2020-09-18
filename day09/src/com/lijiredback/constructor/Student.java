package com.lijiredback.constructor;

public class Student extends Person {
    // 子类自己特有的属性
    private int score;

    public Student() {
        // 子类在初始化之前，一定要先完成父类数据的初始化
        // 所以，子类在初始化之前，一定要先访问父类的构造方法，完成父类数据的初始化
        // 系统在每一个构造方法中，默认隐藏一句代码 super()
        super();
        System.out.println("我是子类空参构造方法...");
    }

    public Student(int score) {
        super(); // 系统默认会加这一句
        this.score = score;
        System.out.println("我是子类带参构造方法！！！");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
