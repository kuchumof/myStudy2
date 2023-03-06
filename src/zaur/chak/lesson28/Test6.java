package zaur.chak.lesson28;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 1, 16, 40);
        LocalTime lt1 = LocalTime.of(1, 16);
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ld1.getDayOfMonth());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ld1.getMonth());
        System.out.println(ld1.getMonthValue());
        System.out.println(ld1.getYear());

        /*================================*/
        System.out.println(lt1.getNano());
        System.out.println(lt1.getSecond());
        System.out.println(lt1.getMinute());
        System.out.println(lt1.getHour());
        /*================================*/
        /*формат для даты и времени стандартный*/
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld1);
        System.out.println(ld1.format(d1));

        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt1);
        System.out.println(lt1.format(d2));

        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt1);
        System.out.println(ldt1.format(d3));

        DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld1);
        System.out.println(ld1.format(d4));

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld1);
        System.out.println(ld1.format(shortFormat));
        System.out.println(ldt1);
        System.out.println(ldt1.format(shortFormat));

        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(lt1);
        System.out.println(lt1.format(shortFormat2));
        System.out.println(ldt1);
        System.out.println(ldt1.format(shortFormat2));

        DateTimeFormatter shortFormat3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt1);
        System.out.println(ldt1.format(shortFormat3));
        // альтернативный вариант написания
        System.out.println(shortFormat3.format(ldt1));
    }
}
