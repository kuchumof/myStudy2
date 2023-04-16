package zaur.proChak.lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Kak dela?", "normalno", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        /*одинаковый вывод*/
        list.forEach(e -> System.out.println(e));
    }
}
