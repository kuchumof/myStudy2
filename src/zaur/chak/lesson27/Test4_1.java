package zaur.chak.lesson27;

import java.io.*;

public class Test4_1 {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            fis.read();
            System.out.println("Vsem horoshego dnya!");
        } catch (FileNotFoundException e) {
            System.out.println("��� ������ ��������:      " + e);
        } catch (NullPointerException e) {
            System.out.println("��� ������ ��������:      " + e);
        } catch (IOException  e) {
                System.out.println("��� ������ ��������:      " + e);
        } finally {
            System.out.println("��� finally ����");
        }

        System.out.println("������ ��� ��� �� ����� ��������� � �����������");
    }
}

