package zaur.chak.lesson4.Homework;

public class Student {
    private int studentId;
    private String name;
    private String surname;
    private int course;
    private double matAverageGrade;
    private double ekonomicsAverageGrade;
    private double foreignLanguageAverageGrade;

    public Student() {
    }

    public Student(int studentId, String name, String surname, int course, double matAverageGrade, double ekonomicsAverageGrade, double foreignLanguageAverageGrade) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.matAverageGrade = matAverageGrade;
        this.ekonomicsAverageGrade = ekonomicsAverageGrade;
        this.foreignLanguageAverageGrade = foreignLanguageAverageGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMatAverageGrade() {
        return matAverageGrade;
    }

    public void setMatAverageGrade(double matAverageGrade) {
        this.matAverageGrade = matAverageGrade;
    }

    public double getEkonomicsAverageGrade() {
        return ekonomicsAverageGrade;
    }

    public void setEkonomicsAverageGrade(double ekonomicsAverageGrade) {
        this.ekonomicsAverageGrade = ekonomicsAverageGrade;
    }

    public double getForeignLanguageAverageGrade() {
        return foreignLanguageAverageGrade;
    }

    public void setForeignLanguageAverageGrade(double foreignLanguageAverageGrade) {
        this.foreignLanguageAverageGrade = foreignLanguageAverageGrade;
    }
}

class StudentTest {
    static double sredArefmOcenka(Student st) {
        double sredOcenka = (st.getMatAverageGrade() + st.getEkonomicsAverageGrade() + st.getForeignLanguageAverageGrade()) / 3;
        System.out.println("Средняя арфмитическая отценка студента " + st.getName() + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();

        S1.setStudentId(1);
        S1.setName("Petr");
        S1.setMatAverageGrade(4.5);
        S1.setEkonomicsAverageGrade(4.4);
        S1.setForeignLanguageAverageGrade(2.3);

        sredArefmOcenka(S1);

    }

}
