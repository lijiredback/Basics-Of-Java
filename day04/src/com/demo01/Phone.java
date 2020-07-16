package com.demo01;

/**
 *  类的定义：
 *      定义类
 *      编写类的成员变量
 *      编写类的成员方法
 *  手机类：
 *      类名：Phone
 *      成员变量：品牌(brand)、价格(price)
 *      成员方法：打电话(call)、发短信(sendMessage)
 */

public class Phone {
    String brand;
    int price;

    public void call() {
        System.out.println("call");
    }

    public void sendMessage() {
        System.out.println("send message");
    }
}
