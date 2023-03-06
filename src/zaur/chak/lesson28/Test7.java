package zaur.chak.lesson28;

import java.time.*;
import java.time.format.*;

public class Test7 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 1, 16, 40);
        LocalTime lt1 = LocalTime.of(1, 16);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd.MMMM.yyyy hh:mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(ldt1);
        System.out.println(ldt1.format(f1));
        System.out.println(ldt1.format(f2));

        /*================================*/

        LocalDate date1 = LocalDate.parse("01 02 2015", f2);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);


    }
}
