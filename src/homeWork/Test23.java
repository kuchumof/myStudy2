package homeWork;

import javax.swing.*;

public class Test23 {

    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("��� ��� �����?"); //���� ��� ����� ���������
        String [] array = {"�������", "���������","��������","��������","��������","���������"};
        int i = (int) Math.floor(Math.random() * array.length);
        if ("Sasha".equalsIgnoreCase(text) || "Alex".equalsIgnoreCase(text) || "����".equalsIgnoreCase(text) || "���������".equalsIgnoreCase(text) ||
                "�����".equalsIgnoreCase(text)) {
            JOptionPane.showMessageDialog(null, "� �����, "+text+" �� ���������!");
        } else {
            JOptionPane.showMessageDialog(null, "� �����, "+text+ " �� �� ��� "+ (array[i]) );
        }









    }
}
