package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;
// Необходимо написать программу, где бы пользователю предлагалось ввести число  303.
// Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303".
// Если пользователь ввёл другое число, программа вообще ничего не должна делать.
public class Task3 {
    public static final int INT_303 = 303;
    public static void main(String[] args) {
        System.out.print("Введите число - " + INT_303 + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_303:
                    System.out.println("Вы ввели число " + i);
                    break;
                default:
                    // nothing to do
                    break;
            }

        } catch (InputMismatchException e) {
            // nothing to do
            // System.err.println("Вы ввели не число!");
            //return;
        }

    }
}
