/**
 * ������� 6. �������� ��� ��������: ���� � ���������� � ���,
 * ������ � ������ � �������. ��������, ����� �� ��������� ������?*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �������� � ��/� ");
        int speed1 = sc.nextInt(); // ��/�
        System.out.println("������� ������ �������� � �/� ");
        int speed2 = sc.nextInt(); // �/�


        if (speed1 > speed2*3.6) {
            System.out.println("������ " + speed1);
        } else {
            System.out.println("������ " + speed2);
        }
    }
}
