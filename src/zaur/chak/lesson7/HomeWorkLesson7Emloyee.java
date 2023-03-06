package zaur.chak.lesson7;

public class HomeWorkLesson7Emloyee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public HomeWorkLesson7Emloyee(int id) {
        this.id = id;
    }

    HomeWorkLesson7Emloyee(String surname) {
        this.surname = surname;
    }

    private HomeWorkLesson7Emloyee(double salary) {
        this.salary = salary;
    }

    public void getId () {
        System.out.println("ID = " +id);
    }

    public void getSurname () {
        System.out.println("Surname = " +surname);
    }

    public void getSalary () {
        System.out.println("Salary = " +salary);
    }

}
