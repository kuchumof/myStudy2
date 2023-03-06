package homeWork;

import java.util.Locale;

//2) Нужно удалить все пробелы из текста и вывести на консоль получившийся текст
//"Let's imagine ...You're watching TV. It's a hot evening: You feel thirsty.
// You see an advert for a refreshing drink. You see people looking cool and relaxed.
// You notice the name of the refreshing drink because you think it could be useful for you to satisfy your thirst."
public class Test24 {
    public static void main(String[] args) {
        String s = "Let's imagine ...You're watching TV. It's a hot evening: You feel thirsty. \n" +
                " You see an advert for a refreshing drink. You see people looking cool and relaxed.\n" +
                "You notice the name of the refreshing drink because you think it could be useful for you to satisfy your thirst.";


//        String s2=s.replaceAll("\\s+","");
//        System.out.println(s2.toLowerCase());
        for (int i = 0; i<s.length(); i++) {
            if (!String.valueOf(s.charAt(i)).equals(" ")) {
                System.out.print(s.toLowerCase().charAt(i));
            }
        }


    }
}
