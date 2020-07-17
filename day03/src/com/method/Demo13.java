package com.method;

/*
    需求：在主方法中通过键盘录入三个整数。
         定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量

         10
         30
         20
         30 20 10
 */

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个整数");
        int a = sc.nextInt();
        System.out.println("请输入第2个整数");
        int b = sc.nextInt();
        System.out.println("请输入第3个整数");
        int c = sc.nextInt();

        sort(a, b, c);
    }

    public static void sort(int a, int b ,int c) {
        int max;
        int min;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        int mid = a + b + c - max - min;

        System.out.println(max + " " + mid + " " + min);
    }
}
