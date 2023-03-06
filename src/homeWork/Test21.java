package homeWork;

public class Test21 {
    public static void main(String[] args) {
        int random = 0;
        int counter = 0;

        while (random !=6) {
            random = (int) (Math.random()*9)+1;
            System.out.println(random);
            counter++;
        }
        System.out.println("Необходимое число попыток: "+ counter);
    }
}
