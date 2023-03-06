package zaur.chak.lesson14;

public class Test6 {
    public void time() {
       OUTER: for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa");
          INNER:  for (int minuta = 0; minuta <= 59; minuta++) {
             if (minuta == 21) {
                  continue OUTER;
              }
                System.out.println(chas + ": " + minuta);
                /*if (minuta == 30) {
                    break OUTER;
                }*/
            }
            System.out.println("Conec outer loopa");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
