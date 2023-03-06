package zaur.chak.lesson4.bankaccount;

public class BankAccount {            // класс и три переменных объекта

    private int id;
    private String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void popolnenieScheta(double uvelechenie) {
        this.balance += uvelechenie;
    }


    void snyatieSoScheta(double umenshenie) {
        Double ss = this.balance - umenshenie;
        if (ss > 0) {
            this.balance = ss;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1, "Petr", 25.32);
        BankAccount yourAccount = new BankAccount(2, "Alex", 33.98);
        BankAccount hisAccount = new BankAccount(3, "Igor", 46.35);

//		System.out.println(HisAccount.name);
//		System.out.println(MyAccount.name + " " + MyAccount.balance);
//		System.out.println(YourAccount.id + " " + YourAccount.name + " " + YourAccount.balance);
        myAccount.popolnenieScheta(100);
        hisAccount.snyatieSoScheta(500);
        System.out.println(myAccount.getName() + " " + myAccount.getBalance());
        System.out.println(hisAccount.getName() + " " + hisAccount.getBalance());


    }

}