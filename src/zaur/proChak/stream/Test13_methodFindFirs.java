package zaur.proChak.stream;

import java.util.ArrayList;
import java.util.List;

public class Test13_methodFindFirs {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>(); //����� ������ ���� List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student first = students.stream().map(e->{e.setName(e.getName().toUpperCase());return e;})//����� ���������� �������
                .filter(e->e.getSex()=='f') //������������ �� ����
                .sorted((x,y)->x.getAge()-y.getAge()) //���������� �� ��������
                .findFirst().get(); // ����� ������� ��������
        System.out.println(first);
    }
}
