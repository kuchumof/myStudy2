package zaur.chak.lesson24;

public class Test5 {
}

interface  I1 {
    void abc ();
    default void ghi () {
        System.out.println("Eto metod ghi");
    }
    default void def () {
        System.out.println("Eto metod def");
    }
}

class Z2 implements I1 {
    public void abc () {
        System.out.println("Eto metod abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2 ();
        z.abc();
        z.def();
        z.ghi();
    }
}
