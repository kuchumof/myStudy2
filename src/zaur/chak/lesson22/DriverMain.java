package zaur.chak.lesson22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.time.LocalDate;

public class DriverMain {
    public static void main(String[] args) throws ParseException {
        Car car1 = new Car();
        car1.setMarka("BMW");
        car1.setModel("M3");
        car1.setYear(2001);
        car1.setEnginType("Disel");
        car1.setKuzovType("Sedan");
        car1.setChildCher(true);

        Driver driver1 = new Driver();
        driver1.setName("Vova");
        driver1.setSalary(10.5);
        driver1.setAge(25);
        driver1.setExperience(4);
        driver1.setGradeOfKategori(Arrays.asList("C", "B", "E1"));
        driver1.setWhenGetPrava(new SimpleDateFormat("yyyy-MM-dd").parse("2010-05-20"));
        driver1.setCar(car1);
        boolean isDriverValidate = isDriverValidate(driver1);
        if (isDriverValidate) {
            System.out.println("Secsfull");
        } else System.out.println("Error");

    }

    public static boolean isDriverValidate(Driver driver) {
        if (driver.getAge() < 18 || driver.getAge() > 70) {
            System.out.println("Driver: " + driver.getName() + " is not complite of Age");
            return false;
        }
        if (!driver.getGradeOfKategori().contains("B")) {
            System.out.println("Driver: " + driver.getName() + " is not complite of GradeOfKategori");
            return false;
        }
        Date minusYear = Date.from(LocalDate.now().minusYears(1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        if (driver.getWhenGetPrava().after(minusYear)) {
            System.out.println("Driver: " + driver.getName() + " is not complite of years GetPrava");
            return false;
        }
        return true;
    }
}

