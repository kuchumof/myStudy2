package zaur.chak.lesson16;

public class Test12 {
    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println(s1.isBlank());
        String s2 = "                  ";
        System.out.println(s2.isBlank()); // возвращает truee если состоит из пробела, таба и так далее, иначе false
        String s3 = " ";
        System.out.println(s3.isEmpty());
        String s4 = "";
        System.out.println(s4.isEmpty());
        String s11 = null;
        /*System.out.println(s11.isEmpty());*/
        System.out.println(s11.isBlank());
        /*String s5 = "    prI      veT    ";
        System.out.println(s5.strip()); // удаляет пробелы
        System.out.println(s5.stripLeading());// удаляет пробелы в начале
        System.out.println(s5.stripTrailing());// удаляет пробелы в конце
        String s6 = "poka";
        String s7 = s6.strip();
        System.out.println(s6 == s7);*/

        /*System.out.println(s5.trim().toUpperCase());*/

    }
}
