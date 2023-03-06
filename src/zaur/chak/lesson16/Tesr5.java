package zaur.chak.lesson16;

public class Tesr5 {

}

class Employee {
    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TesrEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        //System.out.println(emp.isManager + emp.salary);
        System.out.println("On manager? " + emp.isManager + " Ego zarplata: " + emp.salary);

    }
}