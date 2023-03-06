package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Даты найти строки сответствующем этому шаблону: YYYY/MM/DD HH:MM
//
//Примеры:
//2012/09/18 12:10 — Да
//2013.09.09 09:09 — Нет
//
//09.09.2017 11:11 - нет
//2011/2/5 12:23:33 - нет
public class Test31 {
    public static void main(String[] args) {

        Pattern p1 = Pattern.compile("\\b(\\d{4})/(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[0-1]) (0\\d|1\\d|2[0-3]):([0-5]\\d)\\b");
        Matcher m1 = p1.matcher("2012/09/18 12:10, 2013.09.09 09:09, 09.09.2017 11:11, 0001/10/18 21:10");

        while (m1.find()) {
            System.out.println("На позиции №: " +m1.start() + " : "+ m1.group() + " ");
        }
    }
}
