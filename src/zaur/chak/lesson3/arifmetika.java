package zaur.chak.lesson3;

public class arifmetika {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(i2 / d1);
        System.out.println(d2 % i1);
        System.out.println(result);

        int a = 10;
        int b = 5;
        int c = a - b;
        a %= 3;
        System.out.println(a);

        a = 5;
        System.out.println(a-- - --a + ++a + a++ + a);

		b=8;
		int z2 = ++b - b++ + ++b - --b;
		System.out.println(z2);

    }
}
