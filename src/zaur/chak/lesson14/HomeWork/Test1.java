package zaur.chak.lesson14.HomeWork;

public class Test1 {
    public static void main(String[] args) {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {
                INNER:
                for (int secunda = 0; secunda <= 59; secunda++) {
                    System.out.println(chas + " : " + minuta + " : " + secunda);
                }
            }
        }
    }
}

