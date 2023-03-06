/**
 * ������� 1 ���� ����������� �����. ����������, ����� �� ��� ���� ������?
 * ������� 4. ���� ����������� �����. ���������� �������� �� ����� ��� ���� ���������� ������;
 * ������� 5. ���� ����������� �����. ��������, �������� �� ��� ����������� ("������������"), �. �.
 * ����� ������, ���������� ������ �������� �������� ��������� �����
 * ������� � ������ ������. ������� ��� ����� � �������.
 */

package javaPlainLanguage.practicalWork2ConditionalOperator;

import java.util.Scanner;

public class Task1_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� ������� �����");
        int data = sc.nextInt();
        int a = data / 100;
        int b = data / 10 % 10;
        int c = data % 10;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " > " + b + " � " + c);
            } else {
                System.out.println(c + " > " + b + " � " + a);
            }
        } else if (b > c) {
            System.out.println(b + ">" + c + " � " + a);
        } else {
            System.out.println(c + " > " + b + " � " + a);
        }
        /*=======================================*/

        if (a + b + c <= 27 && a + b + c >= 10) {
            System.out.println("����� ����������");
        } else {
            System.out.println("����� �� ����������");
        }
        /*=======================================*/

        if (a==c) {
            System.out.println("����� "+data+" �������� �����������");
        } else {
            System.out.println("����� "+data+" �� �������� �����������");
        }

    }
}
