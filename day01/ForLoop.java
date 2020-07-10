/*
    For 循环

    已知 2019 年是猪年，请在控制台输出从 1949年 到 2019年 中所有是猪年的年份
 */

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1949; i < 2020; i++) {
            if ((2019 - i) % 12 == 0) {
                System.out.println(i + "年是猪年");
            }
        }
    }
}