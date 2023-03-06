package zaur.chak.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Kuchumov", 30, 23.49, "office");
        Employee e2 = new Employee();

        e2.setId(2);
        e2.setSurname("Pupkin");
        e2.setAge(29);
        e2.setSalary(33.35);
        e2.setDepartment("base");

        System.out.println(e1.zup(2));
        System.out.println(e2.zup(2));
    }
}
