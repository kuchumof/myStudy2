/**
 * ������� 4. ��� ������ ����� �����. ������ ������� ������������
 * ������ � ����������. �������� ����� ��, ��� ����� ���������
 * ������� ���� ������ �����.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ �������");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= (int) (Math.random()*10);
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        if (sum%2==0) {
            System.out.println("����� ��������� ������� ���� ������ �����");
        } else {
            System.out.println("����� ��������� ������� ���� �������� �����");
        }
    }
}
