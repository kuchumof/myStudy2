package homeWork;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("������� ������ �����: ");
        double a = sc.nextFloat();
        System.out.println("������� ������ �����: ");
        double b = sc.nextFloat();

        System.out.println("����� ���� ����� �����: " + (a + b));
        System.out.println("�������� ���� ����� �����: " + (a - b));
        System.out.println("������������ ���� ����� �����: " + (a * b));
        System.out.println("������� ���� ����� �����: " + (a / b));
        System.out.println("������� �����: " + (a % b));
        sc.close();

    }

}
