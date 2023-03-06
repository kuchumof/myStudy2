package zaur.chak.lesson18.homeWork;

public class Test1 {
    public static int[] sortirovka(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, -5, 20, 40, 11, -91};
        int [] array = sortirovka(a);
        for (int i = 0; i < array.length-1; i++)
        System.out.println(array[i]);
    }
}
