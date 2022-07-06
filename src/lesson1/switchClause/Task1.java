package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;

// Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 7, 3 или 2,
// а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.
public class Task1 {
    public static final int INT_7 = 7;
    public static final int INT_3 = 3;
    public static final int INT_2 = 2;

    public static void main(String[] args) {
        System.out.print("Введите одно из чисел - " + INT_7 + ", " + INT_3 + " или " + INT_2 + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_2:
                case INT_3:
                case INT_7:
                    System.out.println("Вы ввели число " + i);
                    break;
                default:
                    System.out.println("Введенное число не не является числами " + INT_7 + ", " + INT_3 + " или " + INT_2);
                    break;
            }

        } catch (InputMismatchException e) {
            System.err.println("Вы ввели не число!");
            return;
        }
    }
}
