/**
 * ������� 10. �������� ����� ���� ������ (1� � �������,
 * 2� � �����������, 3� � ������). ����������, �������� �� �� ���.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� ������� ����� � �������");
        double ves1 = sc.nextDouble();
        System.out.println("������� ��� ������� ����� � �����������");
        double ves2 = sc.nextDouble();
        System.out.println("������� ��� �������� ����� � ������");
        double ves3 = sc.nextDouble();

        if (ves2 == ves1/1000 && ves2== ves3*1000) {
            System.out.println("��� ��������");
        } else {
            System.out.println("��� �� ��������");
        }
    }
}
