package zaur.proChak.stream;

import java.util.stream.Stream;

public class Test9_methodCount {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        //System.out.println(stream1.count());// кол-во элементов
        System.out.println(stream1.distinct().count());// кол-во уникальных элементов
    }
}
