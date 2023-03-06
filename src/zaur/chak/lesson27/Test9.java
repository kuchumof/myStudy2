package zaur.chak.lesson27;

import java.io.*;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan" + e);
            throw e;
        } finally {
            System.out.println("Eto block finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i polnostyu obrabotan" + e);
        }
    }

    /*void def () throws{
        try {
            int [] array = {1,2,3};
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception poyman i nemnogo obrabotan"+ e);
            throw e;
        } finally {
            System.out.println("Eto block finally");
        }
    }*/
    }
