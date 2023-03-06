package zaur.chak.lesson24;

public class Test5_2 {
}
interface  I111 {
    default void abc() {
        System.out.println("Eto metod abc");
    }
    static void def () {
        System.out.println("Static method 1");
    }
}

interface I222 {
    static void def () {
        System.out.println("Static method 2");
    }
}

 class R2 implements I111, I222 {
     public static void main(String[] args) {
         I111.def();
         I222.def();
     }
}