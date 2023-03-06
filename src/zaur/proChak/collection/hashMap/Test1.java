package zaur.proChak.collection.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map <Integer, String> map1 =new HashMap<>();
        map1.put(1000, "Zaur Tregolov");// добавляем ключ, значение
        map1.put(3568, "Ivan Ivanov");// добавляем ключ, значение
        map1.put(6578, "Matiya Sidorova");// добавляем ключ, значение
        map1.put(15879, "Nikolay Petrov");// добавляем ключ, значение
        map1.put(98745, "Nikolay Petrov"); // добавляем ключ, значение

        map1.put(1000, "Oleg Ivanov"); // добавляем ключ, значение ( если ключи одинаковые, то значение перезапишется)

        map1.put(null, "Sergey Petrov"); // добавляем ключ, значение
        map1.put(85214, null); // добавляем ключ, значение

        map1.putIfAbsent(3568, "Katya Bulgakova"); // добавляет, если такого элемента нет



        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(500));
        System.out.println(map1.keySet());
        System.out.println(map1.values());



        Map <String, String> map2 =new HashMap<>();
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Umniy");
    }
}
