package homeWork.OOP;

public class Specialization extends Profession{
    private String nameOfSpecialization;

    public Specialization(String name, String surname, int age, double ves, double rost, boolean isSmart, String nameOfProfession, boolean isRemoute, int levelOfDanger, String nameOfSpecialization) {
        super(name, surname, age, ves, rost, isSmart, nameOfProfession, isRemoute, levelOfDanger);
        this.nameOfSpecialization = nameOfSpecialization;
    }

    public String getNameOfSpecialization() {
        return nameOfSpecialization;
    }

    public void setNameOfSpecialization(String nameOfSpecialization) {
        this.nameOfSpecialization = nameOfSpecialization;
    }
}
