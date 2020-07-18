package com.demo08;

/*
    面向对象 - 封装：练习

    需求：定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
         定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭()，看家lookHome()

         按照以上要求定义Cat类和Dog类,属性要私有set和get方法
         定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)

         调用成员方法,打印格式如下:
         花色的波斯猫正在吃鱼.....
         花色的波斯猫正在逮老鼠....
         黑色的藏獒正在啃骨头.....
         黑色的藏獒正在看家.....
 */

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setBreed("波斯猫");
        c.setColor("花色");
        c.eat();
        c.catchMouse();

        Dog d = new Dog();
        d.setBreed("藏獒");
        d.setColor("黑色");
        d.eat();
        d.lookHome();
    }
}
