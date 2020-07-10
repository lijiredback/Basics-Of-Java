/*
    利用 switch 语句的 case 穿透现象，解决下面的需求

    需求：键盘录入星期数，输出工作日、休息日
    （1-5）工作日，（6-7）休息日
 */

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch(week) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您的输入有误");
                break;
        }
    }
}