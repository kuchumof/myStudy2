package zaur.chak.lesson27;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4, 8, 1};
        System.out.println("U nas est massiv");
        try {
            System.out.println(array[5]);
            System.out.println("Vsem horoshego dnya!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("��� ������ ��������:      "+ e);
        }
        finally {
            System.out.println("��� finally ����");
        }

        System.out.println("������ ��� ��� �� ����� ��������� � �����������");
    }
}
