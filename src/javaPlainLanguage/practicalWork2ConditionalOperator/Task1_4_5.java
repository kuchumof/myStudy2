/**
 * Вариант 1 Дано трехзначное число. Определить, какая из его цифр больше?
 * Вариант 4. Дано трехзначное число. Определить является ли сумма его цифр двузначным числом;
 * Вариант 5. Дано трехзначное число. Выяснить, является ли оно палиндромом ("перевертышем"), т. е.
 * таким числом, десятичная запись которого читается одинаково слева
 * направо и справа налево. Вывести это число в столбик.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task1_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трех значное число");
        int data = sc.nextInt();
        int a = data / 100;
        int b = data / 10 % 10;
        int c = data % 10;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " > " + b + " и " + c);
            } else {
                System.out.println(c + " > " + b + " и " + a);
            }
        } else if (b > c) {
            System.out.println(b + ">" + c + " и " + a);
        } else {
            System.out.println(c + " > " + b + " и " + a);
        }
        /*=======================================*/

        if (a + b + c <= 27 && a + b + c >= 10) {
            System.out.println("Число двузначное");
        } else {
            System.out.println("Число не двузначное");
        }
        /*=======================================*/

        if (a==c) {
            System.out.println("Число "+data+" является палиндромом");
        } else {
            System.out.println("Число "+data+" НЕ является палиндромом");
        }

    }
}
