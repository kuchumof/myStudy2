package homeWork.OOP;

public class Main {
    public static void main(String[] args) {
        Profession pr1 = new Profession("Alex", "Karvyakin", 27, 78.8, 178.9, true,
                "Doktor", false, 2);
        Specialization sp1 = new Specialization("Petr", "Ivanov", 37, 58.8, 196, true,
                "Doktor", false, 2,
                "Surgeon");
        Specialization sp2 = new Specialization("Artem", "Petrov", 27, 98.4, 146, false,
                "Driver", false, 3,
                "TaxiDriver");


        System.out.println(pr1.getNameOfProfession() + " - " + pr1.getSurname());
        System.out.println(sp1.getNameOfProfession() + " - " + sp1.getNameOfSpecialization() + " - " + sp1.getSurname());
        System.out.println(sp2.getNameOfProfession() + " - " + sp2.getNameOfSpecialization() + " - " + sp2.getSurname());

        System.out.println(sp2.getNameOfProfession() + " - " + sp2.getNameOfSpecialization() + " - " + sp2.getInfo());

    }

}
