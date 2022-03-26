package home_work_1;

public class task_2_0 {
    public static void main(String[] args) {
        int i = 8;
        int a = 2;
        int b = 5 + a / i;   // сначала выполняется деление, потом сложение, в консоли 5, т.к. int целочисленное
        System.out.println(b);
        int c = (5 + a) / i;  // сначала выполняется сложение в скобках, потом деление, в консоли 0, т.к. при делении на меньшего на большее значения
        System.out.println(c);
        int dom = 8;
        int d = (5 + a++) / dom;// (5+2)/8 = 0
        System.out.println(d);
        int x = 8;
        int n = 2;
        int e = (5 + n++) / --x;// (5+2) / 7 = 1
        System.out.println(e);
        int z = 8;
        int u = 2;
        int f = (5 * u >> u++) / --z;// 5*2 = 10; 10 >> 2 = 2; 2/7 = 0
        System.out.println(f);
        int y = 8;
        int k = 2;
        int g = (5 + 7 > 20 ? 68 : 22 * k >> k++) / --y;// если 12 > 20, тогда g = 68, иначе
        System.out.println(g);
        int tr = 8;
        int kl = 2;
        //boolean o = (5 + 7 > 20 ? 68 >= 68 : 22 * kl >> kl++) / --tr;
        //System.out.println(o);
        int v = 2;
        boolean p = 6 - v > 3 && 12 * 12 <= 119;
        System.out.println(p);
        boolean h =true & false;
        System.out.println(h);




    }

}
