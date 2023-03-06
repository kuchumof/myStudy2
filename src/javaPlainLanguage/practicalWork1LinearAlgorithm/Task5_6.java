/**
 * 5. Дано натуральное число n (n >999). Найти:
 * а) число сотен в нем;
 * б) число тысяч в нем.
 * 6. Дано четырехзначное число. Найти:
 * а) сумму его цифр;
 * б) произведение его цифр
 */



package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырех значное число n>999");
        int date = sc.nextInt();
        int a = date/1000;
        int b = date/100%10;
        int c = date/10%10;
        int d = date%10;

        System.out.println("В числе: "+date+" "+a+" тысяч "+b+" сотен "+c+" десятков "+d+" единиц");
        System.out.println("Сумма цифр числа: "+date+" = "+(a+b+c+d));
        System.out.println("Произведение цифр числа: "+date+" = "+a*b*c*d);
    }
}
