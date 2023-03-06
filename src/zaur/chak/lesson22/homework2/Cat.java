package zaur.chak.lesson22.homework2;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
        System.out.println("I am cat and my name is: "+ name);
    }
    public void sleep () {
        System.out.println("Cat sleeps");
    }
}
