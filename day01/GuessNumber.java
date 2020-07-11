/*
    练习使用 Random

    需求：程序自动生成一个 1-100 之间的数字，使用程序实现猜出这个数字是多少

    当猜错的时候，根据不同情况给出相应的提示
        如果猜的数字比真实数字大了，提示你猜的数大了
        如果猜的数字比真实数字小了，提示你猜的数小了
        如果猜的数字与真实数字相等，提示恭喜你猜对了
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // 创建 Scanner 对象
        Scanner sc = new Scanner(System.in);
        // 创建一个随机数
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;

        // 输入
        while(true) {
            System.out.println("猜猜看:");
            int guessNumber = sc.nextInt();

            if (guessNumber < randomNumber) {
                System.out.println("你猜的数小了");
            }

            if (guessNumber > randomNumber) {
                System.out.println("你猜的数大了");
            }

            if (guessNumber == randomNumber) {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}