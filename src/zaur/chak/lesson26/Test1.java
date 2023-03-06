package zaur.chak.lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1= new Car("red", "v4");
        Car c2= new Car("red", "v4");
        Car c3= new Car("black", "v8");
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4= new Car("black", "v8");
        System.out.println(c4);

    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {   // obj является Car? если нет- false
            Car c2 = (Car) obj;     // кастинг obj --->Car
            return (color.equals(c2.color) && engine.equals(c2.engine)); // если color и engine равны, то и объекты равны
        } else {
            return false;
        }
    }
    public String toString () {
        return "Mashina cvet " + color + " i s motorom "+engine;
    }
}
