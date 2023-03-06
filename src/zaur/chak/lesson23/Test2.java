package zaur.chak.lesson23;

public class Test2 {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();
//        Xirurg x = new Xirurg();


        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor d2 = new Xirurg();
        System.out.println(d2.age);
        System.out.println(d2.name);
        System.out.println(d2.salary);
        System.out.println(d2.experience);
        d2.eat();
        d2.lechit();
        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();
    }
}

class Employee {
    String name= "Kolya";
    int age;
    int experience;
    double salary=100;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {

    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class  Xirurg extends Doctor {
    String skalpel;
    void operaciya () {}
}

class Teacher extends Employee {

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {

    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}