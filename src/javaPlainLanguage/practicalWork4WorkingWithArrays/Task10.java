/**
 * ������� 10. � ������� �������� �������� �� ������� 25 ��������
 * �� �����������. ���������� ���������� ������������ ��������,
 * ����������, ��������� � ����������. � ����� �������� ����� ��������
 * ������.
 */
package javaPlainLanguage.practicalWork4WorkingWithArrays;

public class Task10 {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] grade = new int[]{2, 1, 5, 4, 4, 2, 1, 1, 2, 3, 4, 2, 5, 3, 4, 1, 4, 5, 3, 2, 1, 1, 2, 2, 3, 5};
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] <= 2) {
                count1++;
            } else if (grade[i] == 3) {
                count2++;
            } else if (grade[i] == 4) {
                count3++;
            } else if (grade[i] == 5) {
                count4++;
            }
        }
        System.out.println("������������ �������� -"+count1 +
                " ���������� -"+count2+" ��������� -"+count3+" ���������� -"+count4);
        System.out.println("������ "+Math.max((Math.max(count1, count2)),(Math.max(count3, count4))));

    }
}
