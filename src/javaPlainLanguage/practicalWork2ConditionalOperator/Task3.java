/**
 * ������� 3. ���� �������������� �����. ���������� ����� ��
 * ����� ���� ������ ��� ���� ����� ���� ��� ��������� ����*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������� ������� �����");
        int data = sc.nextInt();
        int a = data/1000;
        int b = data/100%10;
        int c = data/10%10;
        int d = data%10;

        if(a+b ==c+d) {
            System.out.println("����� ���� ������ ���� ����� ����� ����  ��������� ���� ����� "+data);
        } else {
            System.out.println("����� ���� ������ ���� �� ����� ����� ����  ��������� ���� ����� "+data);
        }
    }
}
