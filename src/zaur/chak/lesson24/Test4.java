package zaur.chak.lesson24;

public class Test4 {
    public static void main(String[] args) {
        Jumpable j1 = new Human();
        Jumpable j2 = new Animal();
    }
}

class Human implements Jumpable {
    public void jump() {
        System.out.println("CardOwner jumps");
    }
}

class Animal implements Jumpable {
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
    void jump();
}

interface A2 {
    void abc();
}

interface B2 extends A2, Jumpable {
    void def();
}

abstract class D implements B2 {
}