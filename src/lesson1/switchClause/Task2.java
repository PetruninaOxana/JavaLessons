package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;
// Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
// Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
// Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 202"
public class Task2 {
    public static final int INT_202 = 202;

    public static void main(String[] args) {
        System.out.print("Введите число - " + INT_202+ ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_202:
                    System.out.println("Вы ввели число " + i);
                    break;
                default:
                    System.out.println("Вы ввели число не равное " + INT_202);
                    break;
            }

        } catch (InputMismatchException e) {
            System.err.println("Вы ввели не число!");
            return;
        }

    }
}
