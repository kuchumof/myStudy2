package zaur.chak.lesson22.homework1;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        StringBuilder sb1 =new StringBuilder("Alex");
        student1.setName(sb1);
        student1.setCourse(8);
        student1.setGrade(10);
        student1.showInfo();
    }



}
