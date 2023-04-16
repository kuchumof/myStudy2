package zaur.proChak.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
        System.out.println(students);

        info.printStudentsOverGrade(students, 8);
        System.out.println("================================");
        info.printStudentsUnderAge(students, 30);
        System.out.println("================================");
        info.printStudentsMixCondition(students, 20, 9.5, 'f');
        System.out.println("================================");
        info.testStudents(students, new CheckOverGrade());
        System.out.println("================================");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean chek(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("================================");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println("================================");
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        }); // полное написание
        info.testStudents(students, s -> s.avgGrade > 8); // короткое написание

        StudentChecks sc = (Student s) -> s.avgGrade > 8; // присвоение в переменную
        info.testStudents(students, sc);

        System.out.println("================================");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });

        double res = avgOfSmth(students, stud -> stud.avgGrade);
        System.out.println(res);
        double res2 = avgOfSmth(students, stud -> (double)stud.course);
        System.out.println(res2);
        double res3 = avgOfSmth(students, stud -> (double)stud.age);
        System.out.println(res3);
    }

    void printStudentsOverGrade(ArrayList<Student> a1, double grade) {
        for (Student s : a1) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> a1, int age) {
        for (Student s : a1) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex) {
        for (Student s : a1) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }

    void testStudents(ArrayList<Student> a1, StudentChecks sc) {
        for (Student s : a1) {
            if (sc.chek(s)) {
                System.out.println(s);
            }
        }
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }

}

interface StudentChecks {
    boolean chek(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean chek(Student s) {
        return s.avgGrade > 8;
    }
}
