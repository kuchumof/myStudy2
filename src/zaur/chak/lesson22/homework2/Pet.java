package zaur.chak.lesson22.homework2;

public class Pet extends Animal{
    private String name;
    private final int tail =1;
    private final int paw = 4;

    public Pet(String name) {
        super(2);
        this.name = name;
        System.out.println("I am pet");
    }

    public void run () {
        System.out.println("Pet runs");
    }

    public void jump (){
        System.out.println("Pet jumps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        System.out.println("Paw: "+this.paw);
        return this.paw;
    }
}
