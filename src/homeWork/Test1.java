package homeWork;

public class Test1 { //найти из массива максим и минимал значенеи
    public static void main(String[] args) {
        int[] array1 = new int[]{858, 274, 154, 554, 197, 958, 963, 670, 75, 684,
                276, 386, 630, 207, 721, 147, 452, 439, 15, 650, 402, 791, 495, 905,
                715, 915, 853, 684, 856, 365, 829, 670, 346, 138, 28, 85, 615, 830,
                699, 628, 362, 863, 654, 944, 77, 106, 983, 959, 445, 443};
        if (array1.length !=0) {
            Integer a = array1[0];
            Integer b = array1[0];
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] < a) {
                    a = array1[i];
                } else if (array1[i] > b) {
                    b = array1[i];
                }
            }
            System.out.println("a min =" + a);
            System.out.println("b max =" + b);
        } else System.out.println("Massive is empty");
    }
}
