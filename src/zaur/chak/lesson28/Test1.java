package zaur.chak.lesson28;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        /*System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());*/
        LocalDate ld1 = LocalDate.of(2014, 5, 15);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2014, Month.MAY, 15);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15, 30, 25);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15, 30, 25, 359999999);
        System.out.println(lt3);
        LocalDateTime ldt1 = LocalDateTime.of(2014, Month.MAY, 15, 9, 30, 25, 359_999_999);
        System.out.println(ldt1);
        LocalDateTime ldt2 = LocalDateTime.of(ld2, lt3);
        System.out.println(ldt2);

        /*===============================================================*/
        System.out.println(ld1);
        ld1=ld1.plusDays(17);
        System.out.println(ld1);
        ld1=ld1.minusDays(5);
        System.out.println(ld1);

        System.out.println(lt1);
        lt1 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).minusNanos(5);
        System.out.println(lt1);







    }
}
