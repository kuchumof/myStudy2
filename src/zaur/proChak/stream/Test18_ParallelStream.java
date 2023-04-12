package zaur.proChak.stream;

import java.util.ArrayList;
import java.util.List;

public class Test18_ParallelStream {
    public static void main(String[] args) {
        //1 2 3 4 ... 1000000000
        //1          250.000000
        //250.000001 500.000000
        //500.000001 750.000000
        //750.000001 1000000000
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) ->accumulator+element).get();
        System.out.println("sumResult = "+sumResult);

        /** корректная работа стрима*/
        double divisionResult = list.stream()
                .reduce((accumulator, element) ->accumulator/element).get();
        System.out.println("divisionResult = "+divisionResult);

        /** НЕ корректная работа параллель стрима*/
        double divisionResult2 = list.parallelStream()
                .reduce((accumulator, element) ->accumulator/element).get();
        System.out.println("divisionResult2 = "+divisionResult2);


    }
}
