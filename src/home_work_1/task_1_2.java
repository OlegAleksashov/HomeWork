package home_work_1;

public class task_1_2 {
    public static void main(String[] args) {
        int a = 42; // 00101010
        int b = 15; // 00001111
        int c = a & b; // 00001010
        int d = a | b; // 00101111
        int s = ~ a; // 10101100
        int g = a ^ b; // 00100101
        int f = a &= b; // 00001010
        int r = a |= b; // 00001111
        int p = a >>= 1; // 00000111
        int i = a ^= b; // 00001000
        int j = a >> 1; // 00000100
        int u = a << 1; // 00010000
        int q = a <<= 1; // 00010000
        int w = a >>> 1; // 00001000
        int e = a >>>= 1; // 00001000


        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(g);
        System.out.println(f);
        System.out.println(r);
        System.out.println(p);
        System.out.println(i);
        System.out.println(j);
        System.out.println(u);
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);

    }
}
