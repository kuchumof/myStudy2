package zaur.chak.lesson13.HomeWork;

public enum MonthAndDay2015 {
    MONTH_1(1, "31", "����� ������ � � ��� 31 ����"),
    MONTH_2(2, "28", "����� ������� � � ��� 28 ����"),
    MONTH_3(3, "31", "����� ���� � � ��� 31 ����"),
    MONTH_4(4, "30", "����� ������ � � ��� 30 ����"),
    MONTH_5(5, "31", "����� ��� � � ��� 31 ����"),
    MONTH_6(6, "30", "����� ���� � � ��� 30 ����"),
    MONTH_7(7, "31", "����� ���� � � ��� 31 ����"),
    MONTH_8(8, "31", "����� ������ � � ��� 31 ����"),
    MONTH_9(9, "30", "����� �������� � � ��� 30 ����"),
    MONTH_10(10, "31", "����� ������� � � ��� 31 ����"),
    MONTH_11(11, "30", "����� ������ � � ��� 30 ����"),
    MONTH_12(12, "31", "����� ������� � � ��� 31 ����");

    private final int monthNumber;
    private final String day;
    private final String description;

    MonthAndDay2015(int monthNumber, String day, String description) {
        this.monthNumber = monthNumber;
        this.day = day;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getDay() {
        return day;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public static MonthAndDay2015 month2(int x) {
        for (MonthAndDay2015 y : MonthAndDay2015.values()) {
            if (y.getMonthNumber() == x) {
                return y;
            }
        }
        return null;
    }

    public static MonthAndDay2015 [] method3 () {
        MonthAndDay2015 [] m3 = new MonthAndDay2015 []{MONTH_1,MONTH_2, MONTH_3, MONTH_4, MONTH_5, MONTH_6, MONTH_7, MONTH_8, MONTH_9, MONTH_10, MONTH_11, MONTH_12};
        return m3;
    }

}
