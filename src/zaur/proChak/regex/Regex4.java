package zaur.proChak.regex;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "Privet,           moy      drug!       Kak   idet      izuchenie        Java         ?";
        System.out.println(s1);
      //  s1= s1.replace("Java", "SQL");
       // s1=s1.replaceAll(" {2,}", " "); //замена пробелов на 1 пробел
       // s1=s1.replaceAll("\\bi\\w+", "4444"); // замена всех слов с i на 4444
        s1=s1.replaceFirst("\\bi\\w+", "4444"); // замена первого слова с i на 4444
        System.out.println(s1);
    }
}
