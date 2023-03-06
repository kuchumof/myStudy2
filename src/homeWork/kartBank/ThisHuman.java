package homeWork.kartBank;

public class ThisHuman extends CardOwner{
    String name;
    String telefonNumber;

    public ThisHuman() {
    }

    public ThisHuman(String name, String telefonNumber) {
        this.name = name;
        this.telefonNumber = telefonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

}
