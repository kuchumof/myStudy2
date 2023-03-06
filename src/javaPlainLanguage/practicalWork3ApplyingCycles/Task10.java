/**
 *  Вариант 10. Найти среднее арифметическое всех целых чисел
 *  от a до b (значения a и b вводятся с клавиатуры; a меньше либо равно 200)*/

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a <=200");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = new Scanner(System.in).nextInt();
        int sum = 0;
        int count = 0;
        if (a <= 200) {
            for (int i = a; i <= b; i++) {
                sum += i;
                count++;
            }
            System.out.println((double) sum / count);
        } else {
            System.out.println("Вы ввели число не <=200");
        }
    }
}
