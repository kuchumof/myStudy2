/**
 *  Вариант 8. Заполнить массив, состоящий из 30 элементов случайными
 *  числами в пределах от 1 до 9.
 * */
package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [] numbers = new int[30];
        int min = 1;
        int max = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*(max-min)) + min;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
