package com.string;

/*
    用户登录案例

    需求：
        已知用户名和密码，请用程序实现模拟用户登录。总共三次机会，登录之后，给出相应的提示
 */

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        // 1. 设置初始用户名、密码
        String username = "admin";
        String password = "123456";

        // 2. 键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码");
            String scPassword = sc.nextLine();
            if (scUsername.equals(username) && scPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("你的登录机会已达到上限");
                } else {
                    System.out.println("密码错误，你还有" + (2 - i) +"次机会");
                }
            }
        }
    }
}
