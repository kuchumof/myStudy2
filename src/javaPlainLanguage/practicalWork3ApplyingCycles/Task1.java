/**
 * Вариант 1. Одна штука некоторого товара стоит 20,4 тг.
 * Напечатать таблицу стоимости 1-n штук этого товара.
 * Число n вводится с клавиатуры.
 */


package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во товара");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+" штук товара стоят "+i*20.4);
        }
    }
}
