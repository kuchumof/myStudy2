/**
 * ������� 7. �������� ��� �������-��������. ��������, ��� ��� �����,
 * ��� ������ ����� ���� ������� � ����� �� ���� ������� ���������:
 1) ������ ��� � �� 60 ��;
 2) ������ ����������� ��� � �� 64 ��;
 3) ����������� ��� � �� 69 ��.
 ����������, � ����� ��������� ����� ��������� ������ ������.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ��� �� 80 ��");
        int ves = sc.nextInt();
        if (ves<=60) {
            System.out.println("������ ������� ���������");
        }else if (ves>=60 && ves<=64) {
            System.out.println("������ ����������� ���������");
        } else {
            System.out.println("����������� ���������");
        }
    }
}
