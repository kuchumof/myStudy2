package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//http � https
//�������:
//http://example.com/ � ��
//example.com � ���
//������.�� � ���
public class Test36 {
            public static void main(String[] args) {
            Pattern p1 = Pattern.compile("\\bhttp(s?)://\\w+[.](com|ru|��|)");
            Matcher m1 = p1.matcher("http://example.com/ example.com ������.�� https://examples.com/");

            while (m1.find()) {
                System.out.println("�� ������� �: " + m1.start() + " : " + m1.group() + " ");
            }
        }
}
