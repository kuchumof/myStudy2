/**
 * Вариант 9. Найти произведение всех целых чисел от a до b
 * (значения a и b вводятся с клавиатуры; b больше либо равно a)
 */

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b >=a");
        int b = new Scanner(System.in).nextInt();
        int sum = a;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                sum *= i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Вы ввели число b >=a");
        }
    }
}
