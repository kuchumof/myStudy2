package zaur.chak.lesson26;

public class Test4 {
    static void abc (String s) {  //1
        System.out.println("A");
    }
    static void abc (String... s) { //3
        System.out.println("B");
    }
    static void abc (Object s) { //2
        System.out.println("C");
    }
    static void abc (String s1, String s2) { //4
        System.out.println("D");
    }

    static void def (Long a) {
        System.out.println("E");
    }
    static void def (Long ...a) {
        System.out.println("F");
    }
    static void def (long a) {     //1
        System.out.println("G");
    }
    static void def (Object a) {  //3
        System.out.println("H");
    }
    static void def (Integer a) {   //2
        System.out.println("I");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok");
        t.def(50);
    }
}
