package zaur.chak.lesson4.car;

public class Car {
    String color;                                // две перменных
    String engine;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(String cvet, String motor) {   //конструктор с двумя параметрами
        this.color = cvet;                         // значения для перменных в теле конструктора
        this.engine = motor;



        System.out.println("Цвет машины: " + color + " мотор машины: " + engine);
    }
}