package zaur.proChak.generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        X x = new Y();
        /**так писать нельзя*/
        /*List<X> list1 = new ArrayList<Y>();
        List<Number> list2 = new ArrayList<Integer>();
        list2.add(18);
        list2.add(3.14);*/
    }
}

class X {
}

class Y extends X {
}
