/**
 * ������� 7. ��� ������ ����� �����. �������� ����� ��, ��� �����
 * ��������� ������� ���� �������� �����
 */

package javaPlainLanguage.practicalWork4WorkingWithArrays;

public class Task7 {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 85, 4, 5, 33, 4, 56, 89, 41, 2, 3, 45, 68,1};
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum+=numbers[i];
        }
        if (sum%2==0) {
            System.out.println("����� ��������� ������� ���� ������ �����");
        } else {
            System.out.println("����� ��������� ������� ���� �������� �����");
        }
    }
}
