package zaur.chak.lesson28;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, Month.MAY, 15);
        LocalDate ld2 = LocalDate.of(2012, Month.AUGUST, 10);
        System.out.println(ld1.isAfter(ld2));

        LocalTime lt1 = LocalTime.of(15, 30, 25, 359999999);
        LocalTime lt2 = LocalTime.of(03, 5, 18, 5);
        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2014, Month.MAY, 15, 9, 30, 25);
        LocalDateTime ldt2 = LocalDateTime.of(2014, Month.MAY, 15, 9, 30, 25, 4);
        System.out.println(ldt1.isAfter(ldt2));

    }
}
