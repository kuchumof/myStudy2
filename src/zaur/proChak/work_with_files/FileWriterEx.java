package zaur.proChak.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = ("ћного лет размышл€л € над жизнью земной.\n"+
        "Ќепон€тного нет дл€ мен€ под луной.\n"+
        "ћне известно, что мне ничего не известно,\n"+
        "¬от последний секрет из постигнутых мной.\n");
        String s = "privet";
        FileWriter writer=null;
        try {
            writer = new FileWriter("test2.txt", true);
            /*for (int i=0; i<rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }*/
           // writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
