package homeWork.OOP;

public class Profession extends Human{
    private String nameOfProfession;
    private boolean isRemoute;
    private int levelOfDanger;

    public Profession(String name, String surname, int age, double ves, double rost, boolean isSmart, String nameOfProfession, boolean isRemoute, int levelOfDanger) {
        super(name, surname, age);
        this.nameOfProfession = nameOfProfession;
        this.isRemoute = isRemoute;
        this.levelOfDanger = levelOfDanger;
    }

    public String getNameOfProfession() {
        return nameOfProfession;
    }

    public void setRenameProfession(String nameOfProfession, boolean isRemoute, int levelOfDanger) {
        this.nameOfProfession = nameOfProfession;
        this.isRemoute=isRemoute;
        this.levelOfDanger=levelOfDanger;
    }
}
