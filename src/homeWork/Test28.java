package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//(split)  строку в числа  (12.35\23.54'65%66,98) и получить лист интежеров -12 35 23 54 65 66 98
public class Test28 {
    public static void main(String[] args) {
        String s1 = "12.gf/23.54'65%606,a9118";
        Pattern pattern1 = Pattern.compile("[0-9]+");

        String[] array = s1.split("\\w'");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<array.length; i++) {
            Matcher matcher = pattern1.matcher(array[i]);
            while (matcher.find()) {
                list.add(Integer.valueOf(matcher.group()));
            }
        }
        System.out.println(list);
    }
}
