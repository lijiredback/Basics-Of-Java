package com.lijiredback.override;

public class iPearV2 extends iPearV1 {
    @Override
    public void smallBlack() {
        super.smallBlack();
        System.out.println("说中文");
    }
}
