package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test27 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Январь", 31);
        myMap.put("Февраль", 28);
        myMap.put("Март", 31);
        myMap.put("Апрель", 30);
        myMap.put("Май", 31);
        myMap.put("Июнь", 30);
        myMap.put("Июль", 31);
        myMap.put("Август", 31);
        myMap.put("Сентябрь", 30);
        myMap.put("Октябрь", 31);
        myMap.put("Ноябрь", 30);
        myMap.put("Декабрь", 31);

        List<String> myList = new ArrayList<>();
        myList.add("Январь");
        myList.add("Февраль");
        myList.add("Октябрь");
        myList.add("Ноябрь");
        myList.add("Декабрь");

        for (int i = 0; i<myList.size(); i++) {
            if (myMap.containsKey(myList.get(i))) {
                myMap.remove(myList.get(i));
            }
        }
        System.out.println(myMap);
    }
}
