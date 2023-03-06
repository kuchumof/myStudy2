package zaur.proChak.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList< >();
        /*list.add("ok");
        list.add(5);
        list.add(new StringBuilder("efnakjfns"));
        list.add(new Car());*/
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("asadhasff");

        for (Object o : list) {
            System.out.println(o + " dlina " + ((String) o).length());
        }
    }
}
