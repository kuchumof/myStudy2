/**
 * Вариант 9. В ведомости указана зарплата, выплаченная каждому из
 *  сотрудников фирмы за месяц. Определить общую сумму выплаченных по ведомости денег.
 *  Определить максимальную и минимальную зарплату в фирме. Известно,
 *  что в фирме работает 30 человек.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int [] zp = new int[30];
        for (int i = 0; i < zp.length; i++) {
            zp[i] = (int) (Math.random()*600)+300;
        }
        int sum = 0;
        int min = zp[0];
        int max = zp[0];
        for (int i = 0; i < zp.length; i++) {
            sum+=zp[i];
            if (zp[i]>max){
                max = zp[i];
            }
            if (zp[i]<min) {
                min = zp[i];
            }

        }
        System.out.println(Arrays.toString(zp));
        System.out.println("Summa ="+sum+" Min zp=" + min+" Max zp=" + max);
    }
}
