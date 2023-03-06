package zaur.chak.lesson22;

public class Chelovek {
    final String pol;

    Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;
    private int vozrast;
    private int ves;
    private boolean clever;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i>0) {
            vozrast=i;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i>0) {
            ves = i;
        }
    }

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("mail");
        c.setName("Petya");
        c.setVozrast(25);
        c.setVes(65);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
        c.setVes(-20);
        System.out.println(c.getVes());
    }
}
