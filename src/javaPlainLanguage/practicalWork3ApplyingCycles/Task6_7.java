/**
 * ������� 6. ������� �� ������� ��� �������� ����� �� 1 �� 50.
 *  ������� 7. ������� �� ������� ��� ������ ����� �� 1 �� 50.
 *  */

package javaPlainLanguage.practicalWork3ApplyingCycles;

public class Task6_7 {
    public static void main(String[] args) {
        for (int i = 1; i <=50; i++) {
            if(i%2!=0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
        for (int i = 1; i <=50; i++) {
            if(i%2==0) {
                System.out.print(i+", ");
            }
        }

    }
}
