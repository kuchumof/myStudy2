/**
 * ������� 8. ���� ����������� �����. ����������, ������ ��
 * ������������ ��� ���� ����� A (����� A �������� � ����������)*/

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� ������� �����");
        int date = sc.nextInt();
        System.out.println("������� ����� �");
        int a = sc.nextInt();
        int x = date/100;
        int y = date/10%10;
        int z = date%10;
        int pr =x*y*z ;
        if(pr%a==0) {
            System.out.println("������������ ���� ����� "+date+" = "+pr+ " � ��� ������ ����� A ("+a+")");
        }
        else {
            System.out.println("������������ ���� ����� "+date+" = "+pr+ " � ��� �� ������ ����� A("+a+")");
        }
    }
}
