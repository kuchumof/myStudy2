package zaur.chak.lesson12;


import zaur.chak.lesson5.Employee;

import java.util.Arrays;
import java.util.List;

public class Test14 {


    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 23, 300000.21, "office");
        Employee emp2 = new Employee(2, "Petrov", 18, 4000000.82, "object");
        Employee emp3 = new Employee(3, "Sidorov", 33, 9600000.75, "Office");
        Employee emp4 = new Employee(4, "Lipin", 78, 96846312.07, "base");
        Employee emp5 = new Employee(5, "Skvorcov", 16, 7896321.43, "base");

        List<Employee> aEmp = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        for (Employee e1 : aEmp) {
            if (e1.getAge() >= 45) {
                Double s1 = e1.getSalary() * .8;
                System.out.println("Surname: " + e1.getSurname() + ", Age: " + e1.getAge() + " Old salary " + e1.getSalary().intValue() + " New salary " + s1.intValue());

            }
            if (e1.getDepartment().equalsIgnoreCase("office") && e1.getAge() < 30) {
                Double zp_10 = e1.getSalary() * 1.1;
                System.out.println("Surname: " + e1.getSurname() + ", Age: " + e1.getAge() + " Old salary " + e1.getSalary().intValue() + " New salary " + zp_10.intValue());
            }
        }

    }
}
