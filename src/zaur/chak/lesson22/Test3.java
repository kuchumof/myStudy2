package zaur.chak.lesson22;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test3 {
//    void uvelichZP (Employee e) {
//        e.getSalary() = e.getSalary() + 100;
//    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.setName("Ivan");
        doc.setAge(50);
        doc.setExperience(25);
        doc.specializaciya="xirurg";
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
   private String name;
    private int age;
    private int experience;
    private double salary=100;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Doctor extends Employee {

    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }

    public String getSpecializaciya() {
        return specializaciya;
    }

    public void setSpecializaciya(String specializaciya) {
        this.specializaciya = specializaciya;
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
    private List <String> gradeOfKategori = new ArrayList<>();
    private Car car;
    private Date whenGetPrava;

        void vodit() {
        System.out.println("Vodit");
    }

    public List<String> getGradeOfKategori() {
        return gradeOfKategori;
    }

    public void setGradeOfKategori(List<String> gradeOfKategori) {
        this.gradeOfKategori = gradeOfKategori;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getWhenGetPrava() {
        return whenGetPrava;
    }

    public void setWhenGetPrava(Date whenGetPrava) {
        this.whenGetPrava = whenGetPrava;
    }
}

class Car {
    private String marka;
    private String model;
    private int year;
    private String enginType;
    private String kuzovType;
    private boolean isChildCher;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEnginType() {
        return enginType;
    }

    public void setEnginType(String enginType) {
        this.enginType = enginType;
    }

    public String getKuzovType() {
        return kuzovType;
    }

    public void setKuzovType(String kuzovType) {
        this.kuzovType = kuzovType;
    }

    public boolean isChildCher() {
        return isChildCher;
    }

    public void setChildCher(boolean childCher) {
        isChildCher = childCher;
    }
}