/**
 *  ������� 8. ���������� ������� �������� 1, 2, ... 20 �������� ���
 *  � ����� �� �������� ����� (�������� ����� �������� � ����������).*/

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� �������� ��� �� ������� ����");
        double curse = sc.nextDouble();
        for (int i = 1; i <=20; i++) {
            System.out.println(i+" �������� ���"+" = "+curse*i+" ������");
        }
    }
}
