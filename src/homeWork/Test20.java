package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//10-19.99
//20-29.99
//30-49.99
//50-79.99
//80-100.00
public class Test20 {
    public static void main(String[] args) {
        Double[] array = {90.94, 88.96, 22.49, 47.18, 85.14, 65.33, 84.11, 81.51, 25.55, 96.01, 52.70, 52.07, 44.78, 73.18, 59.02, 55.05,
                97.80, 94.28, 11.96, 17.57, 12.24, 70.24, 35.14, 57.52, 32.02, 93.86, 44.33, 33.89, 50.83, 34.71, 26.42, 86.51, 27.84, 81.99,
                98.38, 65.50, 37.25, 30.40, 48.86, 24.10, 21.53, 42.00, 80.65, 24.18, 54.15, 86.15, 47.98, 44.59, 52.74, 63.83, 67.72, 58.02,
                67.17, 38.24, 38.39, 44.49, 84.65, 56.04, 80.55, 27.41, 71.85, 70.94, 46.75, 17.41, 40.67, 23.03, 11.53, 83.83, 10.69, 59.53,
                92.05, 72.56, 82.34, 24.84, 92.14, 50.94, 37.54, 98.06, 48.54, 43.70, 29.65, 84.46, 85.70, 33.19, 76.17, 96.35, 92.86, 72.65,
                53.71, 74.83, 28.02, 49.08, 10.33, 20.43, 47.05, 31.89, 48.71, 67.22, 77.86, 59.93};

        Map<String, List<Double>> m1 = new HashMap<>();
        m1.put("10-19.99", new ArrayList<>());
        m1.put("20-29.99", new ArrayList<>());
        m1.put("30-49.99", new ArrayList<>());
        m1.put("50-79.99", new ArrayList<>());
        m1.put("80-100.00", new ArrayList<>());

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10 && array[i] < 19.99) {
                List<Double> value1 = m1.get("10-19.99");
                value1.add(array[i]);
            } else if (array[i] > 20 && array[i] < 29.99) {
                List<Double> value2 = m1.get("20-29.99");
                value2.add(array[i]);
            } else if (array[i] > 30 && array[i] < 49.99) {
                List<Double> value3 = m1.get("30-49.99");
                value3.add(array[i]);
            } else if (array[i] > 50 && array[i] < 79.99) {
                List<Double> value4 = m1.get("50-79.99");
                value4.add(array[i]);
            } else {
                List<Double> value5 = m1.get("80-100.00");
                value5.add(array[i]);
            }
        }
        for (Map.Entry item : m1.entrySet()) {
            System.out.println("Ключ: "+item.getKey() + "   " +"Значение: "+ item.getValue());
        }
        System.out.println();
        System.out.println(m1);
    }
}
