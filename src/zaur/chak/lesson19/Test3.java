package zaur.chak.lesson19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class Test4 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int a : array) { //foreach Loop
            System.out.print(a + " ");
        }
        System.out.println();
    }
}