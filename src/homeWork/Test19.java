package homeWork;

import java.util.HashMap;
import java.util.Map;

public class Test19 {
    public static void main(String[] args) {
        String[] array = {"Price", "Lowe", "Miller", "Wise", "Robbins", "Ferguson", "Powell",  "Hill", "Lowe", "Lambert",
                "McGee", "Lowe", "Powell", "Russell", "Lee", "Miller", "Burton", "Bass", "Miller", "Powell"};

        Map<String, Long> m1 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (m1.containsKey(array[i])) {
                Long value = m1.get(array[i]);
                m1.put(array[i], ++value);
            } else {
                m1.put(array[i], 1L);
            }
        }
        for (Map.Entry i : m1.entrySet()) {
            System.out.println(i.getKey() + " - " + i.getValue());
        }
    }
}
