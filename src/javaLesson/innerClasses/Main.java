package javaLesson.innerClasses;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Motorola", "XT1575");
        phone.turnOn();
        Display display = phone.getDisplay();

        // Display.Pixel pixel = display. new Pixel(1020200, 100, Display.Color.RED); // если не static
        //  Display.Pixel pixel = new Display.Pixel(123, 123, Display.Color.GREEN); // если static

        /*Display.Pixel pixel = phone.getDisplay().new Pixel(123, 123, Display.Color.GREEN);
        pixel.testScope(456);*/

        phone.call("1234567890");
    }
}
