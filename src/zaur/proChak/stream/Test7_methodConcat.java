package zaur.proChak.stream;

import java.util.stream.Stream;

public class Test7_methodConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream4 = Stream.concat(stream1,stream2);
        stream4.forEach(System.out::println);
    }
}
