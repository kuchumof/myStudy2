/**
 ������� 9. ���� ����� �����. ����� ��, ��� ��� �������������
 ������ ������?
 */
package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� �����");
        int date = sc.nextInt();
        if (date%2==0) {
            System.out.println("����� "+date+" ������");
        } else {
            System.out.println("����� "+date+" �� ������");
        }
    }
}
