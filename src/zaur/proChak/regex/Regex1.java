package zaur.proChak.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow. Lenin street. 51, Flat 48, email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                " Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18, email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321; " +
                "Chuck Norris, USA, Hollywood, A11 stars street, 87, Flat 21, email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

       // Pattern pattern1 = Pattern.compile("\\w+"); // ��� ����� � �����
        // Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b"); // ����� �� 2 �������
        // Pattern pattern1 = Pattern.compile("\\+\\d{9}"); // ������ ���������
         Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.\\w+"); // � �����

        Matcher matcher = pattern1.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: "+ matcher.start()+ " "+ matcher.group());
        }

    }
}
