package zaur.proChak.nested_classes;

public class Test {
    /** static inner class*/
    static class A {}
    /** inner class*/
    class B{}
    /** local class*/
    void method() {
        class C {}
    }
}
