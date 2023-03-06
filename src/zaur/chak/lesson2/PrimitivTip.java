package zaur.chak.lesson2;

public class PrimitivTip {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 014;
        byte b3 = 0xC;
        byte b4 = 0b1100;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        int i1 = 0b0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0x0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        float f1 = 3.14F;
        float f2 = 2.7172F;

        System.out.println(f1);
        System.out.println(f2);

        boolean bool1 = false;
        boolean bool2 = true;

        System.out.println(bool1);
        System.out.println(bool2);

        char c1 = 'z';
        char c2 = '\u0555';
        char c3 = 777;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
