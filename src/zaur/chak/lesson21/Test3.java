package zaur.chak.lesson21;

public class Test3 {
    Test3() {
        System.out.println("Eto konstruktor");
    }

    void Tesr3() {
        System.out.println("Eto method");
    }

    int Test3 = 5;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
