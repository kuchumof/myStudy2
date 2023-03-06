package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test32 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\b0\\d|1\\d|2[0-3]:[0-5]\\d\\b");
        Matcher m1 = p1.matcher("24:00");

        while (m1.find()) {
            System.out.println("На позиции №: " + m1.start() + " : " + m1.group() + " ");
        }
    }
}