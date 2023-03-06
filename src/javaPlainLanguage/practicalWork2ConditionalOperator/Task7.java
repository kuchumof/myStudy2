/**
 * ¬ариант 7. »звестен вес боксера-любител€. »звестно, что вес таков,
 * что боксер может быть отнесен к одной из трех весовых категорий:
 1) легкий вес Ч до 60 кг;
 2) первый полусредний вес Ч до 64 кг;
 3) полусредний вес Ч до 69 кг.
 ќпределить, в какой категории будет выступать данный боксер.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите вес до 80 кг");
        int ves = sc.nextInt();
        if (ves<=60) {
            System.out.println("Ћегка€ весова€ категори€");
        }else if (ves>=60 && ves<=64) {
            System.out.println("ѕерва€ полусредн€€ категори€");
        } else {
            System.out.println("ѕолусредн€€ категори€");
        }
    }
}
