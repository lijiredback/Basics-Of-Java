/*
    while 循环

    需求：世界最高山峰珠穆朗玛峰，海拔（8844.43米 = 8844430毫米）。假如我有一张足够大的纸，它的厚度是 0.1 毫米
    请问，折叠多少次，可以折成珠穆朗玛峰的高度？
 */

public class While {
    public static void main(String[] args) {
        double paper = 0.1;
        int count = 0;
        while (paper <= 8844430) {
            paper *= 2;
            count++;
        }
        System.out.println(count);
    }
}