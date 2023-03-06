package zaur.chak.lesson27;

import java.io.*;

public class Test19 {
    public static void main(String[] args) {
       // Animal2 a = new Mouse();

    }
}

class Animal2 {
    public Animal2() throws FileNotFoundException, IndexOutOfBoundsException {
    }
}

class Mouse extends Animal2 {
    Mouse() throws Exception, IOException, ArrayIndexOutOfBoundsException {    // в саб классе указывать такой же и более широкий Exception
        super();
    }
}

class Human {
    String name;
    int age;

    public Human(String name, int age) throws Exception {
        if (age < 0) {
            throw new Exception("nekorrektniy vozrast");
        }
        this.name = name;
        this.age = age;
    }
}
