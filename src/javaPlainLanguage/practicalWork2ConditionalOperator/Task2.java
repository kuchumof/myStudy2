/**
 * Вариант 2. Определить, является ли число A делителем числа B?
 * И наоборот. (Получить два ответа.)*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число-А");
        int a = sc.nextInt();
        System.out.println("Введите второе число-B");
        int b = sc.nextInt();

        if (a % b == 0) {
            System.out.println("B является делителем числа А");
        } else if (b % a == 0) {
            System.out.println("А является делителем числа В");
        } else {
            System.out.println("ни А ни В не являются делителем");
        }
    }
}
