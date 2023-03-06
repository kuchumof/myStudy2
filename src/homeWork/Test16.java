package homeWork;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = sc.nextFloat();
        System.out.println("Введите второе число: ");
        double b = sc.nextFloat();

        System.out.println("Сумма двух чисел равна: " + (a + b));
        System.out.println("Разность двух чисел равна: " + (a - b));
        System.out.println("Произведение двух чисел равно: " + (a * b));
        System.out.println("Частное двух чисел равно: " + (a / b));
        System.out.println("Остаток равен: " + (a % b));
        sc.close();

    }

}
