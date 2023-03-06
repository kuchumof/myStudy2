package zaur.chak.lesson23;

public class A10 {
    String s1 = "privet";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("sraric method");
    }
}

class B10 extends A10 {
    // String s2 = super.s1 + ", drug!";
    double d1= super.d1;
    boolean s1 = true;

    int summa(int... i) {
        int result = super.summa(i);
        System.out.println("summa: "+result);
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}
