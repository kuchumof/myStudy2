package homeWork;

public class Test17 {
    public static void main(String[] args) {
        for (int i = 1, a = 4; i <= 5; i++, a--) {
            for (int j = a; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("* * * * *\n");
        }
    }
}
