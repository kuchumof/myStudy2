/**
 * Вариант 10. Известна масса трех грузов (1й в граммах,
 * 2й в килограммах, 3й в тоннах). Определить, одинаков ли их вес.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес первого груза в граммах");
        double ves1 = sc.nextDouble();
        System.out.println("Введите вес второго груза в килограммах");
        double ves2 = sc.nextDouble();
        System.out.println("Введите вес третьего груза в тоннах");
        double ves3 = sc.nextDouble();

        if (ves2 == ves1/1000 && ves2== ves3*1000) {
            System.out.println("Вес одинаков");
        } else {
            System.out.println("Вес не одинаков");
        }
    }
}
