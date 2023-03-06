package homeWork;

public class Test8 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 8, 9, 4, 64, 999};
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < Long.MAX_VALUE; j++) {
                int c = j * j;
                if (c < a[i]) {
                    continue;
                } else if (c == a[i]) {
                    System.out.println("Число " + a[i] + " имеет корень и это: "+j);
                    break;
                } else {
                    System.out.println("Число " + a[i] + " не имеет корня");
                    break;
                }
            }
        }
    }
}
