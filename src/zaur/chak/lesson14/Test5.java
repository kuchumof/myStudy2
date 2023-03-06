package zaur.chak.lesson14;

public class Test5 {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }*/
        /*for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue;
            }
            System.out.println(i);
        }*/
        for (int i = 1; i <= 30; i++) {
            if (i == 13) {
                continue;
            }
            if (i%29==0 ) {
                break;
            }
            System.out.println(i);
        }
    }
}
