package homeWork;

import java.util.ArrayList;

//1) ���� ������ "abcdefg"
//���������� �� ����������� "gfedcba"
//��� ������������� ��� ���������� �������
public class Test22 {
    public static void main(String[] args) {
        String s = "abcdefg";


        for (int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
