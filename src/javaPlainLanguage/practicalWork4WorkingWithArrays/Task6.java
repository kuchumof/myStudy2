/**
 *  Вариант 6. Известны оценки ученика по 10 предметам. Определить минимальную
 *  и максимальную оценку. Оценки хранятся в десятичном формате (3.5 - 4.8 и тд)
 * */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

public class Task6 {
    public static void main(String[] args) {
        double [] grade = new double[10];
        grade [0] = 3.9;
        grade [1] = 3.5;
        grade [2] = 2.5;
        grade [3] = 1.7;
        grade [4] = 2.1;
        grade [5] = 1.1;
        grade [6] = 2.8;
        grade [7] = 4.8;
        grade [8] = 5.0;
        grade [9] = 3.4;

        double min = grade[0];
        double max = grade[0];

        for (int i = 0; i < grade.length; i++) {
            if (grade[i]<min) {
                min = grade[i];
            }
            if (grade[i]>max) {
                max= grade[i];
            }
        }
        System.out.println("Min grade="+min+" Max grade="+max);
    }
}
