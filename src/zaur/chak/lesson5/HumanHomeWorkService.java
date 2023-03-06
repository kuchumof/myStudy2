package zaur.chak.lesson5;

public class HumanHomeWorkService {
    public static void main(String[] args) {
        HumanHomeWork h1 = new HumanHomeWork();
        HumanHomeWork h2 = new HumanHomeWork();

        h1.setId(1);
        h1.setName("Alex");
        h1.setSurname("kuchumov");
        h1.setPatronymic("Vyacheslavovich");
        h1.setAge(30);
        h1.setBalance(333.33);

        h2.setId(2);
        h2.setName("Petr");
        h2.setSurname("Petrov");
        h2.setPatronymic("Petrovich");
        h2.setAge(27);
        h2.setBalance(1.33);

        HumanHomeWork h3 = new HumanHomeWork(3, "Ivan", "Ivanovich", "Ivanov", 29, 65.49);
        HumanHomeWork h4 = new HumanHomeWork(4, "Igor", "Olchov", "Aleksandrovich", 32, 65.49);

        System.out.println(h2.getBalance());
        System.out.println(h4.getId() + " " + h4.getName());
    }
}
