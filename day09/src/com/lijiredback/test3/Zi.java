package com.lijiredback.test3;

public class Zi extends Fu {
    public void show() {
        System.out.println("子类 show 方法");
    }

    public void method() {
        show(); // this.show()
        super.show();
    }
}
