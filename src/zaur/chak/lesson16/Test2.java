package zaur.chak.lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("       abcdefg       abcd        ");
        String s3 = new String("privet");
        String s10 = s1.substring(3); // ��������� s10 �������� ������� � 3 �������
        System.out.println(s10);

        String s11 = s1.substring(3, 7); // ��������� s11 �������� ������� � 3 ������� �� 7
        System.out.println(s11);

        String s12 = s2.trim(); // ������� ������� �������, �������� ����������
        System.out.println(s12);

        String s13 = s1.substring(3, 11); // ��������� s11 �������� ������� � 3 ������� �� 11 (���������)
        System.out.println(s13);

        String s14 = s3.replace('r', 'Z'); // ������ ������������� �������
        System.out.println(s14);

        String s15 = s3.replace("vet", "vivka"); // ������ ���������� ��������
        System.out.println(s15);

        String s4 = "poka";
        String s5 = s4.replace('k', 'k');
        System.out.println(s4==s5);

        String s6 = "privet, ";
        String s7 = "drug";
        System.out.println(s6.concat(s7));
        System.out.println(s6 + s7);


    }
}
