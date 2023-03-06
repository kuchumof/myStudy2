/**
 * Вариант 5 Известна масса каждого предмета, загружаемого в автомобиль.
 * Определить общую массу груза. Проверить хватит ли грузоподъёмности
 * автомобиля для перевозки груза. Грузоподъемность вводится с клавиатуры.
 * Известно, что количество загружаемых предметов – 5шт.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите грузоподъемность автомобиля в кг");
        int a = sc.nextInt();
        int sum = 0;
        int[] cargo = new int[]{25, 19, 4, 90, 289};
        for (int i = 0; i < cargo.length ; i++) {
            sum+=cargo[i];
        }
        if (a>=sum) {
            System.out.println("Едем!");
        } else {
            System.out.println("Слишком тяжелый груз!");
        }
    }
}
