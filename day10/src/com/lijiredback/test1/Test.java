package com.lijiredback.test1;

public class Test {
    // 案例：猫和够

    // 需求：定义猫类（Cat）和狗类（Dog）
    // 		猫类成员方法：eat（猫吃鱼）drink（喝水）
    // 		狗类成员方法：eat（狗吃肉）drink（喝水）

    // 分析：
    // 1. 猫类和狗类存在共性方法，应该向上抽取出一个动物类（Animal）
    // 2. 父类 Animal 中，无法将 eat 方法具体实现描述清楚，所以定义为抽象方法
    // 3. 抽象方法需要存活在抽象类中，将 Animal 定义为抽象类
    // 4. 让 Cat 和 Dog 分别继承 Animal，重写 eat 方法
    // 5. 测试类中创建 Cat 和 Dog 对象，调用方法测试
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.drink();

        Cat c = new Cat();
        c.eat();
        c.drink();

        // 1. 抽象类不能实例化（不能创建对象）
        // Animal a = new Animal();
        // a.eat(); // 怎么办？

        // 2. 抽象类中有构造方法

        // 3. 抽象类的子类
        //      a. 必须要重写父类中所有的抽象方法
        //      b. 可以将自己也变成一个抽象类

        // 4. 抽象类中的方法
        //      抽象类中可以没有抽象方法，但是有抽象方法的类一定是抽象类
    }
}
