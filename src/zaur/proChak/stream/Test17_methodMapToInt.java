package zaur.proChak.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test17_methodMapToInt {
    public static void main(String[] args) {
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

        List<Integer> courses = students.stream()
                .mapToInt(e -> e.getCourse())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(courses);

        List<Double> avgGrades = students.stream()
                .mapToDouble(e -> e.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(avgGrades);

        /**выводит сумму курсов*/
        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);

        /**выводит среднее арифметическое курсов*/
        double average = students.stream().mapToInt(e -> e.getCourse()).average().getAsDouble();
        System.out.println(average);

        /**выводит минимальный курс*/
        int min = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
        System.out.println(min);

        /**выводит максимальный курс*/
        int max = students.stream().mapToInt(e -> e.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}
