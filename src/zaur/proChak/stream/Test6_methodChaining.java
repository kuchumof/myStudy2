package zaur.proChak.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6_methodChaining {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.filter(e1 -> {
            System.out.println("!!!");
            return e1 % 2 == 0;
        }).collect(Collectors.toList());
    }
}