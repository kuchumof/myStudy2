package zaur.proChak.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        String rubai = ("����� ��� ��������� � ��� ������ ������.\n" +
                "����������� ��� ��� ���� ��� �����.\n" +
                "��� ��������, ��� ��� ������ �� ��������,\n" +
                "��� ��������� ������ �� ����������� ����.\n");
        String s = "privet";

        try (FileWriter writer = new FileWriter("test2.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            // writer.write(rubai);
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
