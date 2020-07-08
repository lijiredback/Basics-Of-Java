/*
    键盘录入一个三位数，将其拆分为个位、十位、百位，打印在控制台
 */

// 1. 导包
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        // 2. 创建对象
        Scanner sc = new Scanner(System.in);
        // 3. 创建变量接收
        System.out.println("请输入一个三位数: ");
        int i = sc.nextInt();

        int bai = i / 100;
        int shi = i / 10 % 10;
        int ge = i % 10;

        System.out.println("百位是: " + bai);
        System.out.println("十位是: " + shi);
        System.out.println("个位是: " + ge);
    }
}