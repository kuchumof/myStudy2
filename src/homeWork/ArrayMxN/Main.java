package homeWork.ArrayMxN;

import java.util.Arrays;
import java.util.Scanner;

import static homeWork.ArrayMxN.ArrayAppService.maxMin;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ ������ ���������� ������� n*m: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrayApp = new int[n][m];
        for (int i = 0; i < arrayApp.length; i++) {
            for (int j = 0; j < arrayApp[0].length; j++) {
                System.out.println("������ " + (i + 1) + " �������, " + (j + 1) + " ������ �������: ");
                int a = scanner.nextInt();
                arrayApp[i][j] = a;
            }

        }
        scanner.close();

        System.out.println(Arrays.deepToString(arrayApp));

        maxMin(arrayApp);
    }
}
