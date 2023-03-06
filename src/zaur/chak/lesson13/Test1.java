package zaur.chak.lesson13;

import java.util.Arrays;
import java.util.List;

public class Test1 {
}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        Student st2 = new Student(7);
        Student st3 = new Student(8);
        Student st4 = new Student(4);
        Student st5 = new Student(1);

        List<Student> stud = Arrays.asList(st1, st2, st3, st4, st5);
        for (Student st : stud) {
            switch (st.getGrade()) {
                case 2:
                    System.out.println("Student dvoishnik");
                    break;
                case 3:
                    System.out.println("Student troeshnik");
                    break;
                case 4:
                    System.out.println("Student horoshist");
                    break;
                case 5:
                    System.out.println("Student otlishnik");
                    break;
                default:
                    System.out.println("ocenka neverna");

            }

        }
      /*  if (st1.grade==2) {
            System.out.println("Student dvoishnik");
        }
else  if (st1.grade==3) {
            System.out.println("Student troeshnik");
        }
        else  if (st1.grade==4) {
            System.out.println("Student horoshist");
        }
        else  if (st1.grade==5) {
            System.out.println("Student otlishnik");
        }
        else {
            System.out.println("ocenka neverna");
        }*/
    }
}