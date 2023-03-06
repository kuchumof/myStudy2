package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Test15 {
    public static void main(String[] args) {
        String[] array = new String[]{"Price", "Waters", "Gomez", "Wise", "Robbins", "Ferguson", "Derguson",
                "Peters", "Hill", "Adams", "Lambert", "McGee", "Lowe", "Rowe", "Russell", "Lee", "Miller", "Burton", "Bass", "King", "Powell"};
        Integer chislo = 0;
        List<String> array1 = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > chislo) {
                chislo = array[i].length();
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == chislo) {
                array1.add(array[i]);
            }
        }
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }
    }
}