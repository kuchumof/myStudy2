package zaur.chak.lesson5;

import java.util.ArrayList;

public class DeveloperService {
    public static void main(String[] args) {
        Developer d1 = new Developer();
        Developer d2 = new Developer();
        Developer d3 = new Developer();

        d1.setId(1);
        d1.setName("Petr");
        d1.setSurname("Ivanov");
        d1.setPatronymic("Ivanovich");
        d1.setAge(25);
        d1.setSalary(205.15);

        d2.setId(2);
        d2.setName("Alex");
        d2.setSurname("Aleksandrov");
        d2.setPatronymic("Aleksandrovich");
        d2.setAge(32);
        d2.setSalary(211.16);

        d3.setId(3);
        d3.setName("Evgenyi");
        d3.setSurname("Urievich");
        d3.setPatronymic("ku");
        d3.setAge(12);
        d3.setSalary(99.29);

        ArrayList <Developer> ald1 = new ArrayList<>();
        ald1.add(d1);
        ald1.add(d2);
        ald1.add(d3);

        Double s = 0.;

        for (Developer a: ald1) {
            s = a.getSalary() + s;

        }
        System.out.println(s);

//        Double sa = (d1.getSalary() + d2.getSalary() + d3.getSalary()) / 3;
//
//        String df = new DecimalFormat("#0.000").format(sa);
//
//        System.out.println("Srednee arfmiticheskoe - " + df);
    }

}
