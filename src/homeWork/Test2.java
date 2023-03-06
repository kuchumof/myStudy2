package homeWork;

public class Test2 { // из массива распрделить четные и не четные числа
    public static void main(String[] args) {
        int[] array = new int[]{858, 274, 154, 554, 197, 958, 963, 670, 75, 684,
                276, 386, 630, 207, 721, 147, 452, 439, 15, 650, 402, 791, 495, 905,
                715, 915, 853, 684, 856, 365, 829, 670, 346, 138, 28, 85, 615, 830,
                699, 628, 362, 863, 654, 944, 77, 106, 983, 959, 445, 443};
        int[] arrayChet = new int[50];
        int[] arrayNechet = new int[50];
        String a = " ";
        String b = " ";

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayChet[i]=array[i];
            }
            else arrayNechet[i]=array[i];
            }
        for ( int j=0; j<arrayChet.length; j++) {
            if (arrayChet[j] !=0) {
               a +=arrayChet[j]+ ", ";
            }
        }
        for ( int j=0; j<arrayNechet.length; j++) {
            if (arrayNechet[j] !=0) {
                b +=arrayNechet[j]+ ", ";
            }
        }
        System.out.println(a);
        System.out.println(b);
        }
    }
