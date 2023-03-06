package zaur.chak.lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb1;
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(sb3));
    }
}
