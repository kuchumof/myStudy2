/**
 * Вариант 6. Вывести на консоль все нечетные числа от 1 до 50.
 *  Вариант 7. Вывести на консоль все четные числа от 1 до 50.
 *  */

package javaPlainLanguage.practicalWork3ApplyingCycles;

public class Task6_7 {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i++) {
            if(i%2!=0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
        for (int i = 1; i <=50; i++) {
            if(i%2==0) {
                System.out.print(i+", ");
            }
        }

    }
}
