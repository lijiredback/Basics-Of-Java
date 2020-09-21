package com.lijiredback.test2;

// 抽象类：模板设计模式
// 模板中给定标题，结尾（形成模板）
// 内容让子类去实现
public abstract class CompositionTemplate {
    public final void write() {
        System.out.println("《我的爸爸》");

        body();

        System.out.println("啊~~这就是我的爸爸");
    }

    public abstract void body();
}


