/**
 Вариант 9. Дано целое число. Верно ли, что оно заканчивается
 четной цифрой?
 */
package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int date = sc.nextInt();
        if (date%2==0) {
            System.out.println("Число "+date+" четное");
        } else {
            System.out.println("Число "+date+" не четное");
        }
    }
}
