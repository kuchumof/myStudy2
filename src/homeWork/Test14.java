package homeWork;

public class Test14 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array.length - 1) {
                if (array[i + 1] - array[i] != 1) {
                    a = array[i + 1] - 1;
                }
            }
        }
        System.out.println(a);
    }
}
