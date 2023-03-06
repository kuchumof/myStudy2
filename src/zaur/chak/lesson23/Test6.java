package zaur.chak.lesson23;

public class Test6 {
}

class Animal1 {
    static String showName () {
        return "some Animal1";
    }

    void showInfoAboutAnimal () {
        System.out.println("Name of animal: "+ showName());
    }
}
class Mouse1 extends Animal1 {
   static String showName () {
        return "Jerry";
    }
    void showInfoAboutMouse1 () {
        System.out.println("Name of mouse: "+ showName());
    }

    public static void main(String[] args) {
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse1();
    }
}