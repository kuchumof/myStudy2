package javaLesson.collections.arrays;

import java.util.Scanner;

public class ArrayLauncher2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray1 = new int[8];
        System.out.println("Please enter 8 int elements:");

        for (int j = 0; j < myArray1.length; j++) {
            System.out.println("Next element:");
            myArray1[j] = scanner.nextInt();
        }
        int[] array = sort(myArray1);
        for (int i = 0; i < myArray1.length;  /*если НЕ известно кол-во элементов в массиве*/ i++) {
            System.out.println("Element # " + i + " = " + myArray1[i]);
        }
    }

    // Сортировка элементов массива - метод Пузырька( не эффективен, так как много проходов цикла)
    private static int[] sort(int[] array) {
        // int[] myNewArray = Arrays.copyOf(array, array.length); // скопировать один массив в другой
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; /* cравнение предпоследнего элемента с последним*/ j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
// 10, 5, 16, 4
// 5, 10, 16, 4
// 5, 10, 4, 16
// 5, 4, 10, 16
// 4, 5, 10, 16

}
