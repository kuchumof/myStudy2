package zaur.proChak.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map1 = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        map1.put(st1, 7.5);
        map1.put(st2, 8.7);
        map1.put(st3, 9.2);
        System.out.println(map1);

        Student st4 = new Student("Zaur", "Tregulov", 3);
        Student st5 = new Student("Igor", "Sidorov", 4);
        boolean result = map1.containsKey(st4);
        System.out.println("result = " + result); // для true необходимо переопределить equals и hashCode через alt+Insert
        System.out.println(st1.equals(st4));
        System.out.println();
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

        for (Map.Entry<Student, Double> entry: map1.entrySet()) {
            System.out.println(entry.getKey()+ " : " +entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16,0.75f);



    }
}

final class Student {
    final  String name;
    final String surname;
    final  int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    /*@Override
    public int hashCode() {
        return name.length()*7+ surname.length()*11+course*53;
    }*/
}

