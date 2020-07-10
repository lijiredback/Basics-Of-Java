/*
    switch 语句练习

    需求：键盘录入星期数，显示今天的减肥活动

    周一：跑步
    周二：游泳
    周三：慢走
    周四：动感单车
    周五：拳击
    周六：爬山
    周日：好好吃一顿
 */

 import java.util.Scanner;

 public class LoseWeight {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int week = sc.nextInt();

         switch(week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("你的输入有误，请重新输入");
                break;
         }
     }
 }