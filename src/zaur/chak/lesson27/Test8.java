package zaur.chak.lesson27;
import java.io.*;
public class Test8 {

    static int abc () {
        int a = 5;
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            System.out.println("peremennaya a v catch blocke = "+a);
            return a;
        }
        finally {
            a=10;
            System.out.println("Eto block finally");
            System.out.println("peremennaya a v finally blocke = "+a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
