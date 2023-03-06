package zaur.chak.lesson26;

public class Test5_1 {
    {

        System.out.println("Eto init block 3");
    }

    Test5_1() {
        System.out.println("Eto konstruktor 1");
    }

    Test5_1(int a) {
        this();
        System.out.println("Eto konstruktor 2");
    }

    {

        System.out.println("Eto init block 1");
    }
    static  {
        System.out.println("Eto STATIÑ init block 1");
    }

    {

        System.out.println("Eto init block 2");

    }

    static  {
        System.out.println("Eto STATIÑ init block 2");
    }

    public static void main(String[] args) {
        Test5_1 t1 = new Test5_1();
        Test5_1 t2 = new Test5_1(3);
    }
}
