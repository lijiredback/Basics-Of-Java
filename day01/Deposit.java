/*
    用户输入金额、年限，计算到期后的本息和

    1年     2.25%
    2年     2.7%
    3年     3.25%
    5年     3.6%

    本金+本金×年利率×年限
*/

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要存入多少本金：");
        int price = sc.nextInt();
        System.out.println("请输入你要存入的年限：");
        int year = sc.nextInt();

        double result = 0;

        if (year == 1) {
            result = price + price * 0.0225 * 1;
            System.out.println(result);
        } else if (year == 2) {
            result = price + price * 0.027 * 2;
            System.out.println(result);
        } else if (year == 3) {
            result = price + price * 0.032 * 3;
            System.out.println(result);
        } else if (year == 5) {
            result = price + price * 0.036 * 5;
            System.out.println(result);
        } else {
            System.out.println("该年份无法计算");
        }
    }
}