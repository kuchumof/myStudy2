package zaur.chak.lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        System.out.println(s1.length()); // ����� ������� s1

        char c1= s1.charAt(3); // ����� ������ ��������� �� n-�������
        System.out.println(c1);

        System.out.println(s1.indexOf('t')); // �� ����� ������� ��������� ������������ ������
        System.out.println(s1.indexOf("vet")); // �� ����� ������� ��������� ������������ ������
        System.out.println(s1.indexOf("Z")); // �� ����� ������� ��������� ������������ ������ ( ��� ��������� ��������� -1)
        System.out.println(s1.indexOf("v", 2)); // ����� ������� � ������������� �������
        System.out.println(s1.startsWith("pr")); // ���������� � ...
        System.out.println(s1.startsWith("ri",1));// ���������� � ... + ����������� ������
        System.out.println(s1.endsWith("et"));// �������������

    }
}
