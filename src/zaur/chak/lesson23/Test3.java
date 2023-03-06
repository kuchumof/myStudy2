package zaur.chak.lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        Teacher1 t = new Teacher1();
        e.eat();
        t.eat();
    }
}

class Eda {
}

class Frukti extends Eda {}

class Employee1 {
    String name = "Kolya";
    int age;
    int experience;
    double salary = 100;

    Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher1 extends Employee1 {

    Frukti eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}