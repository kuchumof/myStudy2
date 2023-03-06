/**
 *  Вариант 3. Известен возраст (в годах в виде 14,5 лет и т. п.) каждого
 *  ученика двух классов. Определить средний возраст учеников каждого
 *  класса. В каждом классе учатся 20 человек
 * */
package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double minAge = 7.0;
        double maxAge = 18.0;
        double [] class1 = new double[20];
        double [] class2 = new double[20];
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < class1.length; i++) {
            class1[i] = (Math.random()*(maxAge-minAge)) + minAge;
            sum1+=class1[i];
        }
        System.out.println("Средний возраст учеников в class1 = "+sum1/20);
        System.out.println(Arrays.toString(class1));
        for (int i = 0; i < class2.length; i++) {
            class2[i] = (Math.random()*(maxAge-minAge)) + minAge;
            sum2+=class2[i];
        }
        System.out.println("Средний возраст учеников в class1 = "+sum2/20);
        System.out.println(Arrays.toString(class2));

    }
}
