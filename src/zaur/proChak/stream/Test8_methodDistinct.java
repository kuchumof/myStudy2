package zaur.proChak.stream;

import java.util.stream.Stream;

public class Test8_methodDistinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.distinct().forEach(System.out::println);
    }
}
