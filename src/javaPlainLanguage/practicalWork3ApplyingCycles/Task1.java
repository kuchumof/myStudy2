/**
 * ������� 1. ���� ����� ���������� ������ ����� 20,4 ��.
 * ���������� ������� ��������� 1-n ���� ����� ������.
 * ����� n �������� � ����������.
 */


package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���-�� ������");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+" ���� ������ ����� "+i*20.4);
        }
    }
}
