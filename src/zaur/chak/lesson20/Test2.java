package zaur.chak.lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");
        for (String s:list) {
            System.out.println(s+ " ");
        }
        System.out.println();
       /* for (int i =0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        list.set(1, "!!!");
        for (String s:list) {
            System.out.println(s+ " ");
        }
    }
}
