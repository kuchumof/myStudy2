/**
 * Вариант 8. Дано трехзначное число. Определить, кратно ли
 * произведение его цифр числу A (число A вводится с клавиатуры)*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трех значное число");
        int date = sc.nextInt();
        System.out.println("Введите число А");
        int a = sc.nextInt();
        int x = date/100;
        int y = date/10%10;
        int z = date%10;
        int pr =x*y*z ;
        if(pr%a==0) {
            System.out.println("Произведение цифр числа "+date+" = "+pr+ " и оно кратно числу A ("+a+")");
        }
        else {
            System.out.println("Произведение цифр числа "+date+" = "+pr+ " и оно НЕ кратно числу A("+a+")");
        }
    }
}
