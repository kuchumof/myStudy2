package zaur.proChak.regex;

import java.util.regex.Pattern;

public class Regex6 {

    void checkIP(String ip) {
                String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));

        //25[0-5]                |                      2[0-4]\d               |              [01]?\d?\d)             (\.)
        //250-255               |                      200-249               |              0-199                     .

    }

    public static void main(String[] args) {
        // 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        String ip3 = "192.168.1.1";
        Regex6 r6 = new Regex6();
        r6.checkIP(ip1);
        r6.checkIP(ip2);
        r6.checkIP(ip3);

    }
}
