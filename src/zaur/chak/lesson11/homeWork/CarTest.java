package zaur.chak.lesson11.homeWork;

public class CarTest {
    static void changeDoorCount(Car c, int doorCount) {
        c.setDoorCount(doorCount);
    }

    static void chageColor(Car c1, Car c2) {
        String color = c1.getColor();
        c1.setColor(c2.getColor());
        c2.setColor(color);
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "v4", 2);
        Car car2 = new Car("yellow", "v6", 4);
        CarTest.changeDoorCount(car1, 3);
        CarTest.chageColor(car1, car2);
        System.out.println("���������� � ������ ������: ����: " + car1.getColor() + " �����: " + car1.getEngine() + " ���-�� ������: " + car1.getDoorCount());
        System.out.println("���������� � ������ ������: ����: " + car2.getColor() + " �����: " + car2.getEngine() + " ���-�� ������: " + car2.getDoorCount());
    }
}
