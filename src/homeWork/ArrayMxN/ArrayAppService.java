package homeWork.ArrayMxN;

public class ArrayAppService {

    public static void maxMin(int[][] arrayApp) {
        int min = arrayApp[0][0];
        int max = arrayApp[0][0];
        for (int i = 1; i < arrayApp.length; i++) {
            for (int j = 1; j < arrayApp[0].length; j++) {
                if (arrayApp[i][j] > max) {
                    max = arrayApp[i][j];
                }
                if (arrayApp[i][j] < min) {
                    min = arrayApp[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент массива: " + min + " максимальный элемент массива: " + max);
    }
}
