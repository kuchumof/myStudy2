package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test29 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m1 = p1.matcher("1+1=2");

        while (m1.find()) {
            System.out.println("На позиции №: " +m1.start() + " : "+ m1.group() + " ");
        }
     }

}
