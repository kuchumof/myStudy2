package homeWork;

public class Car3 {
    String color;
    String ingine;
    int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIngine() {
        return ingine;
    }

    public void setIngine(String ingine) {
        this.ingine = ingine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int gaz(int skorost) {
        speed = speed + skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println(color + " " + ingine + " " + speed);
    }
}

class Car3Test {
    public static void main(String[] args) {
        Car3 c = new Car3();
        c.setColor("blue");
        c.setIngine("V6");
        c.setSpeed(50);
        int skorost = c.gaz(20);
        c.showInfo();
        c.tormoz(80);
        c.showInfo();
    }
}
