package homeWork.kartBank;

import java.util.Date;

public abstract class CardOwner implements Action{
    boolean isActive=true;
    String createDate="10.10.2021";
    double balance=120.12;

    @Override
    public void block() {
        if (isActive==false) {
            System.out.println("Vasha karta uzshe zablokirovanna!!!");
        } else {
            isActive = false;
            System.out.println("Vasha karta Zablokirovana!");
        }
    }

    @Override
    public void recreate() {
        createDate = new Date().toString();
        System.out.println("Data vipuska izmenena na: "+ createDate);
    }

    @Override
    public void pay(double sum) {
        if (balance>=sum) {
            balance= balance-sum;
            System.out.println("Oplata sovershena uspeshno. Wash tekuchiy balans: "+balance);
        } else {
            System.out.println("Sredst ne dostatochno na karte!");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Wash tekuchiy balans: "+balance);
    }
}
