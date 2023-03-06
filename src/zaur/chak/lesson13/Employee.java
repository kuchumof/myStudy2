package zaur.chak.lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("sreda") {
            case "ponedelnik":

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subbota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenye":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("Takogo dnya ne suchestvuet");
        }
    }
}
