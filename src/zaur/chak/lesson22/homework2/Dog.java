package zaur.chak.lesson22.homework2;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: "+ name);
    }

    public void play () {
        System.out.println("Dog plays");
    }


}
