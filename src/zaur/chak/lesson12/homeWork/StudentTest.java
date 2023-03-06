package zaur.chak.lesson12.homeWork;

import zaur.chak.lesson11.Student;

public class StudentTest {
    public static void method1(Student st1, Student st2){
        if (st1.equals(st2)) {
            System.out.println("Studenti ravny");
        } else {
            System.out.println("Studenti NE ravny");
        }
    }

    public static void method2(Student st1, Student st2){
        if (st1.getName().equalsIgnoreCase(st2.getName())) {
            if (st1.getCourse().equals(st2.getCourse())) {
                if (st1.getGrade().equals(st2.getGrade())) {
                    System.out.println("Studenti ravny ");
                } else {
                    System.out.println("Otcenka NE sovpadaet "+ st1.getGrade());
                }
            } else {
                System.out.println("Kurs NE sovpadaet " + st1.getCourse());
            }

        } else {
            System.out.println("Imya NE ravno "+ st1.getName());
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Petr", 1, 5.3);
        Student st2 = new Student("Petr", 1, 5.3);

        method1(st1, st2);
        method2(st1, st2);

    }
}
