/**
 * ������� 5 �������� ����� ������� ��������, ������������ � ����������.
 * ���������� ����� ����� �����. ��������� ������ �� ����������������
 * ���������� ��� ��������� �����. ���������������� �������� � ����������.
 * ��������, ��� ���������� ����������� ��������� � 5��.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���������������� ���������� � ��");
        int a = sc.nextInt();
        int sum = 0;
        int[] cargo = new int[]{25, 19, 4, 90, 289};
        for (int i = 0; i < cargo.length ; i++) {
            sum+=cargo[i];
        }
        if (a>=sum) {
            System.out.println("����!");
        } else {
            System.out.println("������� ������� ����!");
        }
    }
}
