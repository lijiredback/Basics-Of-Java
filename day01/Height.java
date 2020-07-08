/*
    定义三个变量，获取最大值
*/

public class Height {
    public static void main(String[] args) {
        int a = 165;
        int b = 140;
        int c = 210;

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(max);
    }
}