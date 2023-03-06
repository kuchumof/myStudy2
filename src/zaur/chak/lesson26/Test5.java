package zaur.chak.lesson26;

public class Test5 {
    String s1;
    {
        s1= "ok";
        System.out.println("Hello");
        int a = 5;
        System.out.println(a);
        System.out.println("Eto init block 1");
    }

    {

        System.out.println("Eto init block 2");

    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }
}
