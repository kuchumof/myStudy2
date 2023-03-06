package homeWork;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(20);
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(858);
        A.add(274);
        A.add(154);
        A.add(554);
        A.add(197);
        A.add(958);
        A.add(963);
        A.add(670);
        A.add(75);
        A.add(684);
        A.add(276);
        A.add(386);
        A.add(630);
        A.add(207);
        A.add(721);
        A.add(147);
        A.add(452);
        A.add(439);
        A.add(15);
        A.add(650);

        Collections.sort(A);
        System.out.println(A);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) <= 888) {
                B.add(A.get(i));
            }
        }
        Collections.sort(B);
        System.out.println(B);
    }
}


