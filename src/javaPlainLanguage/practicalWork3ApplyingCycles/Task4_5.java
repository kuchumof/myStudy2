/**
 * ������� 4. ����� ����� ����� �� m �� n (m � n �������� �
 * ����������). ��� ���� ������� ��������: n,m  � �������� �� -256 �� 256
 * ������� 5. ����� ������������ ����� �� m �� n (m � n �������� �
 * ����������). ��� ���� ������� ��������: n,m  � �������� �� -256 �� 256
 */

package javaPlainLanguage.practicalWork3ApplyingCycles;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� -256<=m<=256");
        int m = sc.nextInt();
        if (m >= -256 && m <= 256) {
            m = sc.nextInt();
        } else {
            System.out.println("�� ����� ����� �� -256<=m<=256");
        }
        System.out.println("������� ����� -256<=n<=256");
        int n = sc.nextInt();
        if (n >= -256 && m <= 256) {
            n = sc.nextInt();
        } else {
            System.out.println("�� ����� ����� �� -256<=n<=256");
        }
        int sum = 0;
        int proizv = 1;
        for (int i = m; i <=n; i++) {
            sum+=i;
        }
        for (int i = m; i <=n; i++) {
            proizv*=i;
        }
        System.out.println("����� �� m �� n= "+sum);
        System.out.println("������������ �� m �� n= "+proizv);
    }
}
