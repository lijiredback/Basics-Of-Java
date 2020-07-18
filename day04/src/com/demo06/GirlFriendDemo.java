package com.demo06;

public class GirlFriendDemo {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();

        gf.setName("凤姐");
        gf.setWeight(130.0);
        gf.setHeight(155.0);

        gf.show();
        gf.wash();
        gf.cook();
    }
}
