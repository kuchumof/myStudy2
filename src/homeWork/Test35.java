package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Дана строка 'aba aca aea abba adca abea'. Напишите регулярное выражение, которое найдет строки abba и abea, не захватив adca.
public class Test35 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\b\\w{2}[^c]\\w\\b");
        Matcher m1 = p1.matcher("aba aca aea abba adca abea");

        while (m1.find()) {
            System.out.println("На позиции №: " + m1.start() + " : " + m1.group() + " ");
        }
    }
}
