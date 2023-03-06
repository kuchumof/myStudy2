package zaur.chak.lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        System.out.println(s1.length()); // длина объекта s1

        char c1= s1.charAt(3); // какой симбол находитс€ на n-индексе
        System.out.println(c1);

        System.out.println(s1.indexOf('t')); // на каком индексе находитс€ определенный симбол
        System.out.println(s1.indexOf("vet")); // на каком индексе находитс€ определенный симбол
        System.out.println(s1.indexOf("Z")); // на каком индексе находитс€ определенный симбол ( при отсутсвии выводитс€ -1)
        System.out.println(s1.indexOf("v", 2)); // поиск симбола с определенного индекса
        System.out.println(s1.startsWith("pr")); // начинаетс€ с ...
        System.out.println(s1.startsWith("ri",1));// начинаетс€ с ... + определнный индекс
        System.out.println(s1.endsWith("et"));// заканчиваетс€

    }
}
