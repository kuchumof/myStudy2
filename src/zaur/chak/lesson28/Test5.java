package zaur.chak.lesson28;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2017, Month.MAY, 31);
        LocalTime lt1 = LocalTime.of(10, 30, 20);
        LocalDateTime ldt1 = LocalDateTime.of(2017, Month.MAY, 31, 10, 30, 20);
        //Period p = Period.ofMonths(10).ofDays(10); //chaining не работает
        Period p = Period.ofMonths(10);
        p = Period.ofDays(10);
        System.out.println(ld1.plus(p));

        /*====================================*/

        Duration d = Duration.ofHours(3);
        System.out.println(lt1.plus(d));

        /*====================================*/

        Duration d2 = Duration.ofMinutes(3);
        System.out.println(ldt1.plus(d2).plus(p));

    }
}
