package zaur.chak.lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
//        emp.sleep();
        t.sleep();
        Employee2 e = new Teacher2();
        e.sleep();
    }
}

class Employee2 {
    String name = "Kolya";
    double salary = 100;

    Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    static void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher2 extends Employee2 {
@Override
    Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
    static void sleep() {
        System.out.println("Spit uchitel");
    }
}
