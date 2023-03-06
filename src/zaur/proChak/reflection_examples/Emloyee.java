package zaur.proChak.reflection_examples;

public class Emloyee {
    public  int id;
    public String name;
    public String depatment;
    private double salary = 1000;

    public Emloyee() {
    }

    public Emloyee(int id, String name, String depatment) {
        this.id = id;
        this.name = name;
        this.depatment = depatment;
    }

   /* public Employee(int id, String name, String depatment, double salary) {
        this.id = id;
        this.name = name;
        this.depatment = depatment;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }*/

    private void changeDepartment (String newDepartment) {
        depatment=newDepartment;
        System.out.println("New department is; "+depatment);
    }

    public void increaseSalary () {
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depatment='" + depatment + '\'' +
                ", salary=" + salary +
                '}';
    }
}
