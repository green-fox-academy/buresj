// make b smaller by 7
// make the "a" variable's value bigger by 10
// please double c's value
// please divide by 5 d's value
// please cube of e's value
// tell if f1 is bigger than f2 (print as a boolean)
// tell if the double of g2 is bigger than g1 (print as a boolean)
// tell if it has 11 as a divisor (print as a boolean)
// tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
// tell if j is dividable by 3 or 5 (print as a boolean)


public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f = f1 > f2;
        System.out.println(f);

        int g1 = 350;
        int g2 = 200;
        boolean g = (g1 *= 2) > (g2 *= 2);
        System.out.println(g);

        int h = 135798745;
        int h1 = h / 11;
        int h2 = h / h1;
        boolean hh = h2 == 11;
        System.out.println(hh);

        int i1 = 10;
        int i2 = 3;
        i1 *= 3;
        i2 = 3 * 3 * 3;
        boolean i3 = i1 > i2;
        System.out.println(i3);

        int j = 1521;
        boolean jj = ((j %= 3) == 0) || ((j %= 5) == 0);

        System.out.println(jj);
    }
}
