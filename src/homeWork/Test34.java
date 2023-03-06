package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Составить регулярное выражение для поиска даты рождения в следующем формате: 01.07.1990
public class Test34 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("((0[1-9]|2[0-9]|3[0-1])[- .](0[1-9]|1[0-2])[- .](1\\d{3}|2\\d{3}))");
        Matcher m1 = p1.matcher("01.07.1990 32.01.1992 31.13.1992 05-05-1999 04042022 0123123");

        while (m1.find()) {
            System.out.println("На позиции №: " + m1.start() + " : " + m1.group() + " ");
        }
    }
}
