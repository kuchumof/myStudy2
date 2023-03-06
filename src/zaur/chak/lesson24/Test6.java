package zaur.chak.lesson24;

public class Test6 {
}
interface P1 {
    private static void method1 () {
        System.out.println("static method 1");
    }
    private void method2 () {
        System.out.println("non-static method");
    }
    default void method3 () {
        method1();
        method2();
    }

    static void method4 () {
        method1();
        //method2();  невозможно вызвать нон-статик метод в статическом контексте
    }
}