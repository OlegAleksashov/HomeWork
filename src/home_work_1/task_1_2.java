package home_work_1;

public class task_1_2 {
    public static void main(String[] args) {
        int a = 42; // 00101010
        int b = 15; // 00001111
        int c = a & b; // результат
        int d = a | b;
        int s = ~ a;
        int g = a ^ b;
        int f = a &= b;
        int r = a |= b;
        int p = a ^ b;
        int i = a ^= b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(g);
        System.out.println(f);
        System.out.println(r);
        System.out.println(p);
        System.out.println(i);

    }
}
