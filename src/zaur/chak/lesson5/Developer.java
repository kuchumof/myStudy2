package zaur.chak.lesson5;

public class Developer {
    private Integer id;
    private String name;
    private String surname;
    private String patronymic;
    private  Integer age;
    private Double salary;

    public Developer() {
    }

    public Developer(Integer id, String name, String surname, String patronymic, Integer age, Double salary) {  // конструктор
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {  // методы
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
