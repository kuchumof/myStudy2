/**
 * 1. ���� ��� �����- ����� ������ ������������. ��������� ��������
 * � �������� ��������� ���������� ��������� ������������.
 * 2. ���� ��� �����- ����� ������ ������������. ��������� ��������
 * � �������� ��������� ���������� ������� ������������.
 */

package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ������� ������������: ");
        float a = scanner.nextFloat();
        System.out.println("������� ������ ������� ������������: ");
        float b = scanner.nextFloat();
        System.out.println("������� ������ ������� ������������: ");
        float c = scanner.nextFloat();

        float p = a+b+c;
        System.out.println("�������� ������������ = "+p);
        float p2=p/2;
        float s = (float) Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
        System.out.println("������� ������������ = "+s);


    }
}
