package javaLesson.constructors.domainmodel;

public class Employee {
    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private double salary;
    private String department;

    static {
        id = 1000;
        System.out.println("Static init block called");
    }

    {
        department = "IT";
        System.out.println("Non-static init block called");
    }

    public Employee() {
        this("A", "B", 100.1);
        System.out.println("Empty constructor called");
    }

    public Employee(String name, String position, double salary) {
        this(name, position, salary, "IT");
        System.out.println("Constructor with 3 params called");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    private Employee(String name, String position, double salary, String department) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Constructor with 4 params called");

    }
}
