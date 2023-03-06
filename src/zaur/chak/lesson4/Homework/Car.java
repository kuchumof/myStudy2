package zaur.chak.lesson4.Homework;

public class Car {
	int id;
	String color;
	String motor;
}

class CarTest {
	public static void main(String[] args) {
		Car C1 = new Car();
		Car C2 = new Car();
		Car C3 = new Car();

		C1.id = 1;
		C1.color = "red";
		C1.motor = "V6";

		C2.id = 2;
		C2.color = "black";
		C2.motor = "V8";

		C3.id = 3;
		C3.color = "blue";
		C3.motor = "V7";

		System.out.println("Машина: " + " " + C1.id + " " + C1.color + " " + C1.motor);
		System.out.println("Машина: " + " " + C2.id + " " + C2.color + " " + C2.motor);
		System.out.println("Машина: " + " " + C3.id + " " + C3.color + " " + C3.motor);
	}
}
