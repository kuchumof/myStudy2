package homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(2, 6, 8, 4, 8, 2);
        ArrayList<Integer> B = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (B.contains(A.get(i))) {

            } else B.add(A.get(i));
        }
        Collections.sort(B);
        System.out.println("Массив В= " + B);
    }
}
