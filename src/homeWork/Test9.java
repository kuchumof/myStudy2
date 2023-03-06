package homeWork;

public class Test9 {
    private static int count;

    public static void main(String[] args) {
        String[] array = new String[]{"d", "t", "o", "k", "l", "q", "q", "i", "k", "s", "k", "q", "w", "d", "a", "s",
                "f", "b", "a", "c", "d", "d", "d", "s", "b", "f", "f", "a", "d", "a", "e", "f", "d", "e", "c", "f", "c", "f", "c", "e", "e",
                "d", "a", "c", "g", "s", "e", "f", "e", "d"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase("s")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
