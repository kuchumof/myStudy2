package homeWork;

public class Test25 {
    public static void main(String[] args) {
        String r1 = "a";
        String r2 = "b";
        System.out.println("r1 = " + r1 + " " + "r2 =" + r2);

        r1 = r1 + r2;
        r2 = r1.substring(0, r1.length() - r2.length());
        r1 = r1.substring(r2.length(), r1.length());

        System.out.println("r1 = " + r1 + " " + "r2 =" + r2);
    }
}
