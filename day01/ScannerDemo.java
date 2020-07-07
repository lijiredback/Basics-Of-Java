// 1. 导包
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 2. 创建对象
        Scanner sc = new Scanner(System.in);
        // 3. 创建变量，接收录入的值
        int i = sc.nextInt();
        // 4. 打印结果
        System.out.println("输入的结果是:" + i);
    }
}