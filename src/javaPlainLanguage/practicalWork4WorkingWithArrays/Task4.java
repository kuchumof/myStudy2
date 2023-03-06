/**
 * Вариант 4. Дан массив целых чисел. Размер массива пользователь
 * вводит с клавиатуры. Выяснить верно ли, что сумма элементов
 * массива есть четное число.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= (int) (Math.random()*10);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        if (sum%2==0) {
            System.out.println("Сумма элементов массива есть Четное число");
        } else {
            System.out.println("Сумма элементов массива есть Нечетное число");
        }
    }
}
