package zaur.proChak.stream;

import java.util.stream.Stream;

public class Test10methodPeek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream1.distinct().peek(System.out::println).count() );
    }
}