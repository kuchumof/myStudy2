package zaur.chak.lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        int a = list.get(0);
        System.out.println(a);
        Long l = 50l;
        Number b = new Integer(10);
        int c= (int)b;
        switch (c) {}

        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        double d = Double.parseDouble(s3);
        System.out.println(i1);
        System.out.println(b1);
        System.out.println(d);

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
        System.out.println(i3);
        System.out.println(d2);


    }
}
