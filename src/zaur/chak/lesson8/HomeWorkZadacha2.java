package zaur.chak.lesson8;

public class HomeWorkZadacha2 {
    public static final double PI = 3.14;

    public double ploshad(double radius) {
        return  PI * radius * radius;

    }

    public static double dlina(double radius2) {
        return  2 * PI * radius2;

    }

    public void info(double radius3) {
        System.out.println("Радиус:  " + radius3);
        System.out.println("Площадь круга: = " + ploshad(radius3));
        System.out.println("Длина окружности:   = " + dlina(radius3));
    }
}
