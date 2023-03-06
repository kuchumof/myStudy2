package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Составить регулярное выражение для поиска номера телефона в следующем формате: 8(7152)46-76-01

public class Test33 {

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("8((\\(\\d{4}\\))|\\d{4})\\d{2}-\\d{2}-\\d{2}");
        Matcher m1 = p1.matcher("8(7152)46-76-01 +7(912)777-90-2 8(822)640-39-73");

        while (m1.find()) {
            System.out.println("На позиции №: " + m1.start() + " : " + m1.group() + " ");
        }
    }
}
