public class Convert {
    public static void main(String[] args) {
        // 1. 隐式转换（小的转大的，直接转）
        // int 先变 double ，再运算
        int a = 10;
        double b = a;
        System.out.println(b);

        // 2. 强制转换（大的转小的，会损失精度，不建议经常使用）
        double c = 12.3;
        int d = (int)c;
        System.out.println(d); // 12 丢失精度

        // 3. byte short char 三种数据运算时，都先转为 int
        byte e = 10;
        byte f = 20;
        int g = e + f;
        System.out.println(g);
    }
}