package homeWork;

import java.util.ArrayList;

//1) Есть строка "abcdefg"
//Необходимо ее перевернуть "gfedcba"
//Без использования доп джавовских функций
public class Test22 {
    public static void main(String[] args) {
        String s = "abcdefg";


        for (int i = s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
