/***
 * ������� 2 ���������� ������� ��������� �� ����� n. ����� n
 * �������� � ����������.
 *  ������� 3. ���������� ������� ��������� �� ����� n. ����� n
 *  �������� � ����������. ��������� ������� n �� ������ 1 � �� ������ 9.
 */

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 9");
        int n = sc.nextInt();
        if (1 <= n && n <= 9) {
            for (int i = 1; i <=9 ; i++) {
                System.out.println(n+"*"+i+" = "+n*i);
            }
        } else {
            System.out.println("�� ����� ����� �� � ��������� �� 1 �� 9");
        }
    }
}
