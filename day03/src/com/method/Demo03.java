package com.method;

/*
    需求：  设计一个方法（print），用于打印 n 到 m 之间所有的奇数
 */
public class Demo03 {
    public static void main(String[] args) {
        print(5, 10);
    }

    public static void print(int minNum, int maxNum) {
        for (int i = minNum; i <= maxNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
