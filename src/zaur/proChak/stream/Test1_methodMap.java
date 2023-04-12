package zaur.proChak.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1_methodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        // 6 9 2 4
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        //System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        //5, 3, 1,8, 1
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        //System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("ok");
        set.add("poka");

        System.out.println(set);

        // 6 9 2 4
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);

        /*============================================================================================*/

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>(); //Здесь должен быть List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students.stream().map(e->e.getName()).collect(Collectors.toList()));


    }
}
