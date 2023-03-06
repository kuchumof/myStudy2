package javaLesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage ("Ivan");
        printMessage ("Petr");
        printMessage ("Alex");

        int x =5;
        int y =20;
        calcRectangleSquare(x,y);

        int square2 = calcRectangleSquare2(10,20);
        System.out.println("Rectangle square = "+square2);

        System.out.println(calcSquare(5));
    }

   static void printMessage (String name) {
        System.out.println("Hello "+ name+ " !!!");
    }
    static void calcRectangleSquare (int a, int b) {
        int square = a*b;
        System.out.println("Rectangle square = "+square);
    }
    static int calcRectangleSquare2 (int a, int b) {
        int square = a*b;
        return square;
    }

    static int calcSquare(int a) {;
        return a*a;
    }


}
