package homeWork;

public class Test6 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 6, 8, 4, 8, 2};
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            for (int l = 0; l < a.length; l++)
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }

            for (int q = 0; q < a.length; q++) {
                for (int w = 0; w < b.length; w++) {
                    if (a[q] == b[w]) {
                        break;
                    } else if (b[w] == 0) {
                        b[w] = a[q];
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println(b[i]);
            }
        }
    }
}


