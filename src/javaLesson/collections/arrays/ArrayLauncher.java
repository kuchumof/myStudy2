package javaLesson.collections.arrays;

public class ArrayLauncher {
    public static void main(String[] args) {
       /* int [] myArray = new int[10];  ������ ������ ������������� �������
        myArray[0]=0;
        myArray[1]=100;
        myArray[2]=200;
        myArray[3]=300;
        myArray[4]=400;
        myArray[5]=500;
        myArray[9]=900;
        myArray[10]=1000;*/

        int[] myArray = {0, 100, 200, 300, 400, 500};
        /*System.out.println("Element 4 = "+ myArray[4]);*/

        for (int i = 0; i < 6; i++) { // ���� �������� ���-�� ��������� � �������
            System.out.println("Element # " + i + " = " + myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) { // ���� �� �������� ���-�� ��������� � �������
            System.out.println("Element # " + i + " = " + myArray[i]);
        }

    }
}
