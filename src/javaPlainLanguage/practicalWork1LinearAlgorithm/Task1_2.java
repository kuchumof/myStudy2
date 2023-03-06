/**
 * 1. Даны три числа- длины сторон треугольника. Составить алгоритм
 * и написать программу вычисления периметра треугольника.
 * 2. Даны три числа- длины сторон треугольника. Составить алгоритм
 * и написать программу вычисления площади треугольника.
 */

package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        float a = scanner.nextFloat();
        System.out.println("Введите вторую сторону треугольника: ");
        float b = scanner.nextFloat();
        System.out.println("Введите третью сторону треугольника: ");
        float c = scanner.nextFloat();

        float p = a+b+c;
        System.out.println("Периметр треугольника = "+p);
        float p2=p/2;
        float s = (float) Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
        System.out.println("Площадь треугольника = "+s);


    }
}
