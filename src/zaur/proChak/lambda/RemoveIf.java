package zaur.proChak.lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> a1 = new ArrayList<>();
        a1.add("Privet");
        a1.add("Poka");
        a1.add("OK");
        a1.add("Uchim Java");
        a1.add("A imenno lambdas");
        a1.removeIf(e->e.length()<5);
        System.out.println(a1);
    }
}
