package zaur.proChak.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        /*List<Object> list1 = new ArrayList<Integer>();
        List<Number> list2 = new ArrayList<Integer>();*/
        List<?> list3 = new ArrayList<String>();
        //list3.add("hello");

        List<? extends  Number> list30 = new ArrayList<Integer>();
        List<? super  Number> list31 = new ArrayList<Object>();

        List<Double> list4 = new ArrayList<>();
        list4.add(3.14);
        list4.add(3.15);
        list4.add(3.16);
        showListInfo(list4);
        List<String> list5 = new ArrayList<>();
        list5.add("privet");
        list5.add("poka");
        list5.add("ok");
        showListInfo(list5);

        /*==================================================*/


        ArrayList <Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList <Integer> ali = new ArrayList<>();
        ali.add(3);
        ali.add(35);
        ali.add(30);
        System.out.println(summ(ali));

        /*так как дженерик String то метод будет выдавать ошибку*/
        ArrayList <String> als = new ArrayList<>();
        //System.out.println(summ(als));

    }

    static void showListInfo(List<?> list) {
        System.out.println("Moy list soderjit sleduyushie elementi: " + list);
    }

    public static double summ (ArrayList <? extends Number> al){
        double summ=0;
        for (Number n : al) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
