package homeWork;

public class Test4 {
    public static void main(String[] args) {
        int[] a = new int[]{858, 274, 154, 554, 197, 958, 963, 670, 75, 684, 276, 386, 630, 207, 721, 147, 452, 439, 15, 650};
        int[] b = new int[20];

        int[] array = sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 888) {
                b[i] = a[i];
            }
        }

        for (int j = 0; j < b.length; j++) {
            if (b[j] != 0) {
                System.out.println("Element # " + j + " = " + b[j]);
            }
        }
    }

    private static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int l = 0; l < array.length; l++)
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
        }
        return array;
    }
}