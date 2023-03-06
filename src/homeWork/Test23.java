package homeWork;

import javax.swing.*;

public class Test23 {

    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Как Вас зовут?"); //окно для ввола параметра
        String [] array = {"Редиска", "Помидорка","Морковка","Петрушка","Ватрушка","Сарделька"};
        int i = (int) Math.floor(Math.random() * array.length);
        if ("Sasha".equalsIgnoreCase(text) || "Alex".equalsIgnoreCase(text) || "Саша".equalsIgnoreCase(text) || "Александр".equalsIgnoreCase(text) ||
                "Сашка".equalsIgnoreCase(text)) {
            JOptionPane.showMessageDialog(null, "Я думаю, "+text+" ты красавчик!");
        } else {
            JOptionPane.showMessageDialog(null, "Я думаю, "+text+ " ты та ещё "+ (array[i]) );
        }









    }
}
