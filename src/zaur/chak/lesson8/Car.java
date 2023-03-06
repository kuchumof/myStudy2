package zaur.chak.lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Haman {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Haman h1 = new Haman();
       /* h1.c = new ElectricCar();  так как Сar - final
        h1.c = new ElectricCar();*/
        h1.c.engine = "v8";

    }
}
