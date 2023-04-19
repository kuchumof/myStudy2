package javaLesson.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Container<Integer> box = new Container(1);
        Container<String> box2 = new Container("1");

        System.out.println(box.getObject() * 2);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
//         list1.add("poka");

    }
}
