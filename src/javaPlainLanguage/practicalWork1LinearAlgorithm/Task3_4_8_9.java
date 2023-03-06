/**
 3. Дано трехзначное число. Поменять местами первую и последнюю цифру.
 4. Дано двухзначное число. Поменять цифры местами.
 8. Дано трехзначное число. В нем зачеркнули первую слева цифру и
 приписали ее в конце. Найти полученное число.
 9. Дано трехзначное число. Найти число, полученное
 при прочтении его цифр справа налево*/

package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task3_4_8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трех значное число:");
        int date = scanner.nextInt();
        int x = date/100;
        int y = date/10%10;
        int z = date%10;
        System.out.println("Поменять местами первую и последнюю цифру: "+(z*100+y*10+x));
        System.out.println("Зачеркнули первую слева цифру и" +
                " приписали ее в конце: "+(z*10+y*100+x));
        System.out.println("Найти число, полученное" +
                " при прочтении его цифр справа налево: "+(z*100+y*10+x));
    }
}
