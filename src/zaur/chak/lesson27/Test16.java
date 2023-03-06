package zaur.chak.lesson27;

import java.util.ArrayList;

public class Test16 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));

        System.out.println(5/0);  // ArithmeticException
        cratePwd("qwerty");
    }

    public static void cratePwd (String pwd) {
        if (pwd.length()<6) {
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        }
        if (pwd.length()>12) {
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("Parol prinyat");
    }




}
