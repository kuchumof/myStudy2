package homeWork;

public class CarService {
    public static void main(String[] args) {
        Car c1 = new Car(true, 4, 2, true, 5);
        Car c2 = new Car(false, 2, 2, false, 4);
        Car c3 = new Car(true, 4,1,true,0);

//        System.out.println(c1.isEngineWorking()?" Is working  ElectricCar №1 ": "isn't working");
//        System.out.println(c2.isEngineWorking()?" Is working  ElectricCar №2 ": "isn't working");
//        System.out.println(c3.isEngineWorking()?" Is working  ElectricCar №3 ": "isn't working");
        System.out.println(c1.isMoving()? "This Test2 can moving" : "This Test2 is stoped");
        System.out.println(c2.isMoving()? "This Test2 can moving" : "This Test2 is stoped");
        System.out.println(c3.isMoving()? "This Test2 can moving" : "This Test2 is stoped");


    }
}
