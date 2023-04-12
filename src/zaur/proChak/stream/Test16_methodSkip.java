package zaur.proChak.stream;

import java.util.ArrayList;
import java.util.List;

public class Test16_methodSkip {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>(); //«десь должен быть List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().filter(e->e.getAge()>20).forEach(System.out::println);// проход€т фильтрацию
        System.out.println("------------------------------------");
        students.stream().filter(e->e.getAge()>20).limit(2).forEach(System.out::println);// оставл€ет первых 2
        System.out.println("------------------------------------");
        students.stream().filter(e->e.getAge()>20).skip(2).forEach(System.out::println);// пропускает первых 2 и оставл€ет остальных
        System.out.println("------------------------------------");
    }
}
