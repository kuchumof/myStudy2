/***
 * Вариант 2 Напечатать таблицу умножения на число n. Число n
 * вводится с клавиатуры.
 *  Вариант 3. Напечатать таблицу умножения на число n. Число n
 *  вводится с клавиатуры. Проверить условие n не меньше 1 и не больше 9.
 */

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int n = sc.nextInt();
        if (1 <= n && n <= 9) {
            for (int i = 1; i <=9 ; i++) {
                System.out.println(n+"*"+i+" = "+n*i);
            }
        } else {
            System.out.println("Вы ввели число не в диапазоне от 1 до 9");
        }
    }
}
