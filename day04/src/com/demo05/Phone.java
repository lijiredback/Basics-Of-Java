package com.demo05;

/*
    面向对象 - 封装：练习

    需求：定义手机类
         手机有 品牌(brand)  价格(price)   颜色(color) 三个属性
         手机有 打电话(call)  发短信(sendMessage) 两个功能
         请定义出手机类，类中要有set/get方法。

         定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。

         调用对象的两个功能，打印效果如下：
         正在使用价格为3998元黑色的小米手机打电话....
         正在使用价格为3998元黑色的小米手机发短信....
 */
public class Phone {
    private String brand;
    private int price;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void call() {
        System.out.println("正在使用价格为" + this.price + "元"+ this.color + "的" + this.brand + "手机打电话....");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + this.price + "元"+ this.color + "的" + this.brand + "手机发短信....");
    }
}
