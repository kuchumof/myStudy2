package zaur.proChak.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile {
    public static void main(String[] args) {
        try(java.io.RandomAccessFile file = new java.io.RandomAccessFile("test10.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);
            String s1= file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2= file.readLine();
            System.out.println(s2);

            long posotion = file.getFilePointer();
            System.out.println(posotion);

            /*file.seek(0);
            file.writeBytes("Privet");*/

            file.seek(file.length()-1);    // конец файла
            file.writeBytes("\n\t\t\t\t\t\t\t\t\tWilliam Butler Yeats");






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
