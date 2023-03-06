/**
 *  Вариант 8. Напечатать таблицу перевода 1, 2, ... 20 долларов США
 *  в рубли по текущему курсу (значение курса вводится с клавиатуры).*/

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс долларов США на текущую дату");
        double curse = sc.nextDouble();
        for (int i = 1; i <=20; i++) {
            System.out.println(i+" долларов США"+" = "+curse*i+" рублям");
        }
    }
}
