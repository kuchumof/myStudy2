package zaur.chak.lesson18;

public class Test6 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimalniy element massiva: " + min + " Maximalniy element massiva: " + max);
    }

    public static void main(String[] args) {
        double[] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array1);
        maxMin(new double[] {2.5, -1.3});
    }
}
