package homeWork;

public class Test13 {
    public static void main(String[] args) {
        int sum = 0;
        int raz=0;


        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        for ( int i = 0; i< array.length; i++) {
            sum += array[i];
        }
        int a=0;
        for  (int j=0; j<=50; j++) {
            a+=j;
        }
        raz = a-sum;
        System.out.println(raz);
    }
}