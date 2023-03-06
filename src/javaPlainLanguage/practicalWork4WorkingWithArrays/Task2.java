/**
 * ������� 2 �������� ������ �� ������ ������� ������� ���� �������.
 * ���������� ������� ������ � ������ ������, � � ����� ������
 * ������������ �����. ���������� �������� � ������ ������ � 15 ��������.
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

public class Task2 {
    public static void main(String[] args) {
        int[] grade1 = new int[15];
        grade1[0] = 3;
        grade1[1] = 3;
        grade1[2] = 2;
        grade1[3] = 1;
        grade1[4] = 2;
        grade1[5] = 1;
        grade1[6] = 2;
        grade1[7] = 4;
        grade1[8] = 5;
        grade1[9] = 3;
        grade1[10] = 5;
        grade1[11] = 5;
        grade1[12] = 3;
        grade1[13] = 3;
        grade1[14] = 4;

        int[] grade2 = new int[15];
        grade2[0] = 1;
        grade2[1] = 5;
        grade2[2] = 4;
        grade2[3] = 2;
        grade2[4] = 3;
        grade2[5] = 1;
        grade2[6] = 3;
        grade2[7] = 4;
        grade2[8] = 5;
        grade2[9] = 5;
        grade2[10] = 5;
        grade2[11] = 5;
        grade2[12] = 3;
        grade2[13] = 4;
        grade2[14] = 4;

        int sum1 = 0;
        int sum2 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < grade1.length; i++) {
            sum1 += grade1[i];
            if (grade1[i] >= 3) {
                count1++;
            }
        }
        System.out.println("������� ������ � class1 = " + sum1 / 15);

        for (int i = 0; i < grade2.length; i++) {
            sum2 += grade2[i];
            if (grade2[i] >= 3) {
                count2++;
            }
        }
        System.out.println("������� ������ � class2 = " + sum2 / 15);
        if (count1 > count2) {
            System.out.println("������������ � ������1 ����� ��� � ������2");
        } else {
            System.out.println("������������ � ������2 ����� ��� � ������1");
        }
    }
}
