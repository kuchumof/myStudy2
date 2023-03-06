package zaur.proChak.generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet", 20);
        System.out.println("Znachenie pari: value1 = " + pair1.getFirstValue() +
                " , value2 = " + pair1.getSecondValue());
        Pair<Integer, Double> pair2 = new Pair<>(20, 14.4);
        System.out.println("Znachenie pari: value1 = " + pair2.getFirstValue() +
                " , value2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("ok", "poka");
        System.out.println("Znachenie pari: value1 = " + otherPair.getValue1() +
                " , value2 = " + otherPair.getValue2());
    }
}

class Pair<v1, v2> {
    private v1 value1;
    private v2 value2;

    public Pair(v1 value1, v2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public v1 getFirstValue() {
        return value1;
    }

    public v2 getSecondValue() {
        return value2;
    }
}

class OtherPair<v> {
    private v value1;
    private v value2;

    public v abc(v val) {
        return val;
    }

    public OtherPair(v value1, v value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public v getValue1() {
        return value1;
    }

    public v getValue2() {
        return value2;
    }
}
