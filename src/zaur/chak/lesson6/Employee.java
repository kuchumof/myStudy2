package zaur.chak.lesson6;

public class Employee {
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    }

     Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;

    }

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id) {
        this.id = id;
    }

     Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void showInfoId () {
        System.out.println(this.id);
    }

    public void showInfoSalary () {
        System.out.println(this.salary);
    }
    public void showInfoSurname () {
        System.out.println(this.surname);
    }

}

/*class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 29);
        System.out.println(emp2.surname + " " + emp2.age);

    }
}*/

/*
class test1 {
    public static void main(String[] args) {
        Employee empl1 = new Employee(1);
        System.out.println(empl1.id);
        System.out.println(empl1.surname);
        System.out.println(empl1.salary);
    }


}*/
