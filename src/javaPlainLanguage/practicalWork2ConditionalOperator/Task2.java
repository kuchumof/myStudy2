/**
 * ������� 2. ����������, �������� �� ����� A ��������� ����� B?
 * � ��������. (�������� ��� ������.)*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �����-�");
        int a = sc.nextInt();
        System.out.println("������� ������ �����-B");
        int b = sc.nextInt();

        if (a % b == 0) {
            System.out.println("B �������� ��������� ����� �");
        } else if (b % a == 0) {
            System.out.println("� �������� ��������� ����� �");
        } else {
            System.out.println("�� � �� � �� �������� ���������");
        }
    }
}
