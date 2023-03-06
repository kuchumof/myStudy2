package zaur.chak.lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        h.pomosh();
        h.tushitPojar("voda");
        s.swim();
        e.eat();
        e.sleep();

    }
}

class Employee {
    private String name;
    private int age;
    private int experience;
    private double salary = 100;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}
class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    public void tushitPojar(String s) {
        System.out.println("Driver tushit pojar s pomowyu " + s);
    }

    public void swim() {
        System.out.println("Driver mojet plavat");
    }

}
class Doctor extends Employee {
    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar s pomowyu " + s);
    }
}
interface Help_able {

    void pomosh();

    void tushitPojar(String predmet);

    public final static int a = 10;
}

interface Swim_able {
    void swim();
}

abstract class Y implements Swim_able {
}

abstract class X extends Y {
}

class Z extends Y {
    public void swim() {

    }
}