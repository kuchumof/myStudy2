package zaur.chak.lesson27;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws  Exception {
        File f = new File("C:\\Users\\User\\Desktop\\test1.txt");

        FileInputStream fis = new FileInputStream(f);
        fis.read();

        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
        fos.close();
    }
}
