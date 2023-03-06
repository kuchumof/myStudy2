/**
 * Вариант 3. Дано четырехзначное число. Определить равна ли
 * сумма двух первых его цифр сумме двух его последних цифр*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырех значное число");
        int data = sc.nextInt();
        int a = data/1000;
        int b = data/100%10;
        int c = data/10%10;
        int d = data%10;

        if(a+b ==c+d) {
            System.out.println("Сумма двух первых цифр равна сумме двух  последних цифр числа "+data);
        } else {
            System.out.println("Сумма двух первых цифр НЕ равна сумме двух  последних цифр числа "+data);
        }
    }
}
