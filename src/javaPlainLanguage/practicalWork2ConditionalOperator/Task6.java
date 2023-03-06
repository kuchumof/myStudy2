/**
 * Вариант 6. Известны две скорости: одна в километрах в час,
 * другая в метрах в секунду. Выяснить, какая из скоростей больше?*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую скорость в км/ч ");
        int speed1 = sc.nextInt(); // км/ч
        System.out.println("Введите вторую скорость в м/с ");
        int speed2 = sc.nextInt(); // м/с


        if (speed1 > speed2*3.6) {
            System.out.println("Больше " + speed1);
        } else {
            System.out.println("Больше " + speed2);
        }
    }
}
