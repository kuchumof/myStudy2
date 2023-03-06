package homeWork.OOP;

public class Human {
    private String name;
    private String surname;
    private int age;
    private double ves;
    private double rost;
    private boolean isSmart;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String setAge (int age) {
        if (age <=0) {
            return "Error: age<=0";
        } else if (age<this.age) {
            return "Error: "+ age + "must be more then:" +this.age;
        } else if (age>=100) {
            return "Error: " + age + "more or equals then 100";
        }
        this.age= age;
        return "Vozrast " + this.age + "uspeshno izmenen na: "+ age;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setVes(double v) {
        if (v > 0) {
            ves = v;
        }
    }

    public void setRost(double rost) {
        this.rost = rost;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public String getInfo() {
        return name + " - " + age;
    }
}
