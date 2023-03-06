/**
 * Вариант 4. Найти сумму чисел от m до n (m и n вводятся с
 * клавиатуры). При этом сделать проверку: n,m  в пределах от -256 до 256
 * Вариант 5. Найти произведение чисел от m до n (m и n вводятся с
 * клавиатуры). При этом сделать проверку: n,m  в пределах от -256 до 256
 */

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число -256<=m<=256");
        int m = sc.nextInt();
        if (m >= -256 && m <= 256) {
            m = sc.nextInt();
        } else {
            System.out.println("Вы ввели число НЕ -256<=m<=256");
        }
        System.out.println("Введите число -256<=n<=256");
        int n = sc.nextInt();
        if (n >= -256 && m <= 256) {
            n = sc.nextInt();
        } else {
            System.out.println("Вы ввели число НЕ -256<=n<=256");
        }
        int sum = 0;
        int proizv = 1;
        for (int i = m; i <=n; i++) {
            sum+=i;
        }
        for (int i = m; i <=n; i++) {
            proizv*=i;
        }
        System.out.println("Сумма от m до n= "+sum);
        System.out.println("Произведение от m до n= "+proizv);
    }
}
