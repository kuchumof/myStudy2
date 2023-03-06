package javaLesson.exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try (PrintWriter writer = new PrintWriter("C:\\Users\\User\\IdeaProjects\\arifmetika\\src\\com\\javalesson\\exceptions\\out.txt")) {
                System.out.println("Please enter numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator: ");
                int denominator = scanner.nextInt();
                // System.out.println(divide(numerator, denominator));
                writer.println("Result = " + divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException | InputMismatchException e) {
                System.out.println("Exception :" + e);
                scanner.nextLine();
                System.out.println("Only integer non-zero parameters allowed");
            } catch (IOException e) {
                System.out.println("Unable to open File");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException here");
                throw new InvalidInputParamException("Array idex out of bound, throw in do Everything" + e);
            } finally {
                System.out.println("Finally block called");
            }
            System.out.println(" Try catch block finished");
        } while (continueLoop);

    }

    private static int divide(int numerator, int denominator) throws ArithmeticException, NullPointerException { // числитель, знаменатель
        return numerator / denominator;
    }

}
