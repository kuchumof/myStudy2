package zaur.chak.lesson27;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("������ File ��������");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("����� ��������");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("���������� ��������");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("Eto finally");
        }
    }
}
