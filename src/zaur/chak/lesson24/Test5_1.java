package zaur.chak.lesson24;

public class Test5_1 {
}
interface  I11 {
    default void abc() {
        System.out.println("Eto metod abc");
    }
    static void def () {
        System.out.println("Static method");
    }
}

interface I22 extends I11 {
    void abc();
}

abstract class R implements I11 {
//    public void abc() {
//        System.out.println("Eto metod abc!!!");
//    }
    abstract public void abc();
}
