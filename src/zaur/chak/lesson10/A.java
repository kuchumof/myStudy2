package zaur.chak.lesson10;

//import Zaur.chak.lesson9.*;
//import Zaur.chak.lesson8.*;
//import Zaur.chak.lesson9.ElectricCar;
//import Zaur.chak.lesson9.Student;
//import java.lang.*;  // не обязательно, импортируется по умолчанию
//import Zaur.chak.lesson4.Homework.*;  для импорта подпакета необходимо указать полный путь

//import static Zaur.chak.lesson9.ElectricCar.*;

import zaur.chak.lesson9.Car;
import zaur.chak.lesson9.Student;


public class A {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V6");
        Car c2 = new Car("blue", "V8");
        Student st1 = new Student();

        String st4 = new String("hello");
        Student st2 = new Student();
        System.out.println(st2.z);
        /**System.out.println(Student.c);
         System.out.println(ElectricCar.ab);*/

    }
}

class B {
    Student st3 = new Student();
}
