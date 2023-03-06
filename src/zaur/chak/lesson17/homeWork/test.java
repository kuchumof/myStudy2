package zaur.chak.lesson17.homeWork;

public class test {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        test t = new test();
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("privet");
        StringBuilder sb3 = new StringBuilder(" ");
        StringBuilder sb4 = new StringBuilder(" ");
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        System.out.println(ravenstvo(sb5, sb6));
    }
}
