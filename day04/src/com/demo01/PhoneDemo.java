package com.demo01;

/**
 * 创建对象：
 *      格式：类名 对象名 = new 类名();
 *      范例：Phone p = new Phone();
 * 使用对象：
 *      1. 使用成员变量：对象名.变量名 p.brand
 *      2. 使用成员方法：对象名.方法名 p.call()
 */

public class PhoneDemo {
    // 测试类要有 main 方法
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.brand); // null
        System.out.println(p.price); // 0

        p.brand = "iPhone";
        p.price = 12999;

        System.out.println(p.brand); // "iPhone"
        System.out.println(p.price); // 12999

        p.call(); // call
        p.sendMessage(); // send message
    }
}
