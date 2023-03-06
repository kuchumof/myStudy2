/**
 * ¬ариант 1. ¬ области 12 районов. »звестны количество жителей
 * (в тыс€чах человек) и площадь (в км2) каждого района. ќпределить
 * среднюю плотность населени€ по области в целом.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

public class Task1 {
    public static void main(String[] args) {
        double[] area = new double[]{1000, 999, 8454, 54665, 4654, 65, 654, 654, 654, 654, 654, 3546};
        double[] people = new double[]{100, 6546, 655, 6, 878, 545, 65, 1524, 67, 7, 897, 979};

        double sum = 0;

        for (int i = 0, j = 0; i < area.length && j < people.length; i++, j++) {
            sum += area[i] / people[i];
        }
        System.out.println("—редн€€ плотность = " + sum / 12);
    }
}
