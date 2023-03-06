package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//http и https
//Примеры:
//http://example.com/ — Да
//example.com — Нет
//кремль.рф — Нет
public class Test36 {
            public static void main(String[] args) {
            Pattern p1 = Pattern.compile("\\bhttp(s?)://\\w+[.](com|ru|рф|)");
            Matcher m1 = p1.matcher("http://example.com/ example.com кремль.рф https://examples.com/");

            while (m1.find()) {
                System.out.println("На позиции №: " + m1.start() + " : " + m1.group() + " ");
            }
        }
}
