package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//"Basil"  List<07, 12, 1987>
//        myHashMap.put("Basil", "07.12.1987");
//        myHashMap.put("Kate", "12.10.1971");
//        myHashMap.put("Lena", "11.01.1991");
public class Test26 {
    public static void main(String[] args) {
        Map<String, String> myHashMap = new HashMap<>();
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");

        Map<String, List<Integer>> outputHashMap = new HashMap<>();

        for (Map.Entry<String, String> m1: myHashMap.entrySet()) {
         String [] arraySplitString =   m1.getValue().split("\\.");
         List <Integer> list1 = new ArrayList<>();
         for (int i =0; i<arraySplitString.length; i++) {
             list1.add( Integer.valueOf(arraySplitString[i]));
         }
            outputHashMap.put( m1.getKey(), list1);
        }
        System.out.println(outputHashMap);
    }
}
