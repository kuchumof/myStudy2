/**
 * 5. ���� ����������� ����� n (n >999). �����:
 * �) ����� ����� � ���;
 * �) ����� ����� � ���.
 * 6. ���� �������������� �����. �����:
 * �) ����� ��� ����;
 * �) ������������ ��� ����
 */



package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������� ������� ����� n>999");
        int date = sc.nextInt();
        int a = date/1000;
        int b = date/100%10;
        int c = date/10%10;
        int d = date%10;

        System.out.println("� �����: "+date+" "+a+" ����� "+b+" ����� "+c+" �������� "+d+" ������");
        System.out.println("����� ���� �����: "+date+" = "+(a+b+c+d));
        System.out.println("������������ ���� �����: "+date+" = "+a*b*c*d);
    }
}
