package homeWork.kartBank;

public class Main {
    public static void main(String[] args) {
        ThisHuman h1 = new ThisHuman();
        h1.setName("Pavel");
        h1.setTelefonNumber("+7(999)878-12-65");

        Action.oplataKartami();

        h1.showBalance();

        h1.pay(250.12);
        h1.pay(91.0);
        h1.recreate();
        h1.block();

    }
}
