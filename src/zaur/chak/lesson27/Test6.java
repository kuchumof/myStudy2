package zaur.chak.lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("������ �������� 1"+ e);
        } catch (NullPointerException e) {
            System.out.println("������ �������� 2"+ e);
        }
        catch (IOException e) {
            System.out.println("������ �������� 3"+ e);
        }
        catch (RuntimeException e) {
            System.out.println("������ �������� 4"+ e);
        }
        catch (Exception e) {
            System.out.println("������ �������� 5"+ e);
        }
        catch (Throwable e) {
            System.out.println("������ �������� 6"+ e);
        }
    }
}
