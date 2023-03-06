package homeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дано: "JavaScript, Java6, Python, Java7, GO, Arduino, Java8,  Java9, HTML,  Java10,  Java11"
//Вывести: Java6, Java7, Java8...
public class Test30 {
    public static void main(String[] args) {
        String pattern = ("\\bJava\\d+\\b|[^22]\\$");
        String s1 = "Java6Script,Java6,Python,Java7,GO,Arduino,Java8,Java9,HTML,Java10,Java11,Java12,,Java22";

        for (String split: s1.split(",")) {
            if(split.matches(pattern)) {
                System.out.println(split);
            }
        }
    }
}
