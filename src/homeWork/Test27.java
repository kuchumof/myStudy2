package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test27 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("������", 31);
        myMap.put("�������", 28);
        myMap.put("����", 31);
        myMap.put("������", 30);
        myMap.put("���", 31);
        myMap.put("����", 30);
        myMap.put("����", 31);
        myMap.put("������", 31);
        myMap.put("��������", 30);
        myMap.put("�������", 31);
        myMap.put("������", 30);
        myMap.put("�������", 31);

        List<String> myList = new ArrayList<>();
        myList.add("������");
        myList.add("�������");
        myList.add("�������");
        myList.add("������");
        myList.add("�������");

        for (int i = 0; i<myList.size(); i++) {
            if (myMap.containsKey(myList.get(i))) {
                myMap.remove(myList.get(i));
            }
        }
        System.out.println(myMap);
    }
}
