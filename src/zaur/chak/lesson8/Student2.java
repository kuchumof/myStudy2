package zaur.chak.lesson8;

public class Student2 {
    String name;
    int course;
    static int count;
    int a;

    public Student2(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdanno studentov " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student2 st2 = new Student2("Petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student2 st3 = new Student2("Ivan", 2);
        st3.abc();
    }
}


