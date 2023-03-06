package zaur.chak.lesson13.HomeWork;

public class Month {
    public static void metod1(MonthAndDay2015 month) {
        if (month == null) {
            System.out.println("Такого месяца НЕТ!");
        } else {
            System.out.println(month.getDescription());
        }
    }

    public static void main(String[] args) {
        int a = 0;
        /*/MonthAndDay2015 b = MonthAndDay2015.month2(a);
        metod1(b);*/

        for (MonthAndDay2015 lk: MonthAndDay2015.method3()) {
            if (lk.getMonthNumber()==a) {
                metod1(lk);
            }
        }
    }
}
