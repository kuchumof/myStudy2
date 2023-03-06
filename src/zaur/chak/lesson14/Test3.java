package zaur.chak.lesson14;

public class Test3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i > 30) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
                continue;
            }
        }
    }
}
