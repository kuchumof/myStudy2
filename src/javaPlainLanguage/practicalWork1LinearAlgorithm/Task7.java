/**7. ���� ����������� ����� (������ ����� � ������� �� ������ 8.).
 * ��������� ������ ����� ����� ����� �� ������� � �������
 * ��������� ����������.*/

package javaPlainLanguage.practicalWork1LinearAlgorithm;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� ������� ����� n<=88");
        int date = sc.nextInt();
        int a = date/10;
        int b = date%10;
        a++;
        b++;
        System.out.println(a+" "+b);
    }
}
