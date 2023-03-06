package zaur.chak.lesson31.genericstest;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> al1= new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        al1.add(50);

        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList <String> al2= new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("d");
        al2.add("c");

        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement (ArrayList<T> a1){
        return a1.get(1);
    }
}