package zaur.chak.lesson16;

public class Test11 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim(); // но если добавить пробел слева или с право то будет выдавать новый объект и будет false
        System.out.println(x==y);
    }
}
