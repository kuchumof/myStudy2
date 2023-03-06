package javaLesson.constructors;

import javaLesson.constructors.domainmodel.Employee;

public class ConstructorsMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Employee("Alex", "devoloper",  100.2);
        Employee emp2 = new Employee("John", "devoloper",  100.3);

        System.out.println(emp);
       System.out.println(emp1);
        System.out.println(emp2);

    }
}
