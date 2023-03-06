package javaLesson.collections.set;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        /*String[] cars = {"Mini", "Mercedes-Benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "GMC", "Toyota", "Chevrolet"};
        Set<String> carSet = new TreeSet<>(Arrays.asList(cars));
        Set<String> otherCarsSet = new TreeSet<>(Arrays.asList(otherCars));
        Set <String> uniqueCars = new TreeSet<>(carSet);
        uniqueCars.addAll(otherCarsSet);
        print(uniqueCars);*/

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("VW", "Golf", 45));
        sixCars.add(new Car("Audi", "A3", 60));
        sixCars.add(new Car("VW", "Polo", 25));
        sixCars.add(new Car("BMW", "Z4", 120));
        sixCars.add(new Car("BMW", "440i", 200));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Toyota", "Auris", 40));
        europaCars.add(new Car("Reno", "Clio", 30));
        europaCars.add(new Car("Reno", "Megan", 50));
        europaCars.add(new Car("VW", "Golf", 45));
        europaCars.add(new Car("VW", "Polo", 35));

        /*Set<ElectricCar> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        print2(uniqueCars);

        sixCars.removeAll(europaCars);
        europaCars.removeAll(sixCars);
        print2(europaCars);

        sixCars.retainAll(europaCars);
        print2(sixCars);

        uniqueCars.removeAll(sixCars);
        print2(uniqueCars);*/
        NavigableSet<Car> uniqueCars = new TreeSet<>(sixCars);
        uniqueCars.addAll(europaCars);

        SortedSet<Car> cars =uniqueCars.subSet(new Car("Toyota", "Auris", 40),new Car("Audi", "A3", 60) );
        print2(uniqueCars);

        System.out.println("Higher");
        uniqueCars.higher(new Car("Toyota", "Auris", 40));

    }

    private static void print(Set<String> cars) {
        System.out.println(cars);
    }

    private static void print2(Set<Car> cars) {
        System.out.printf("%-20s %-20s %-20s\n", "ElectricCar brand", "Model", "Price per day");
        for (Car car : cars) {
            System.out.printf("%-20s %-20s %-20s\n", car.getCarBrand(), car.getModel(), car.getPricePerDay());
        }
    }
}
