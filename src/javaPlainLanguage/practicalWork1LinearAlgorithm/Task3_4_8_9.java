/**
 3. ���� ����������� �����. �������� ������� ������ � ��������� �����.
 4. ���� ����������� �����. �������� ����� �������.
 8. ���� ����������� �����. � ��� ���������� ������ ����� ����� �
 ��������� �� � �����. ����� ���������� �����.
 9. ���� ����������� �����. ����� �����, ����������
 ��� ��������� ��� ���� ������ ������*/

package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task3_4_8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ���� ������� �����:");
        int date = scanner.nextInt();
        int x = date/100;
        int y = date/10%10;
        int z = date%10;
        System.out.println("�������� ������� ������ � ��������� �����: "+(z*100+y*10+x));
        System.out.println("���������� ������ ����� ����� �" +
                " ��������� �� � �����: "+(z*10+y*100+x));
        System.out.println("����� �����, ����������" +
                " ��� ��������� ��� ���� ������ ������: "+(z*100+y*10+x));
    }
}
