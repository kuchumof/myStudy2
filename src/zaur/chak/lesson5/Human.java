package zaur.chak.lesson5;

import zaur.chak.lesson8.Car;

public class Human {
    public Car c;
    String name;
	Car3 car;
	BankAccount ba;
	void info() {
		System.out.println("Имя: " + name + " цвет машины: " + car.color + " Банковский счет: " + ba.balance);
	}
}
class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "David";
		h.car = new Car3("red", "v8");
		h.ba = new BankAccount(12, 200.5);
		h.info();
	}
}
class Car3 {
	Car3(String c, String e) {
		color = c;
		engine = e;
	}

	String color;
	String engine;
}
class BankAccount {
	BankAccount(int id2, double balance2) {
		id = id2;
		balance = balance2;
	}
	int id;
	double balance;
}