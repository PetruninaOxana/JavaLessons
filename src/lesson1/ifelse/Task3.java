package lesson1.ifelse;

import java.util.InputMismatchException;
import java.util.Scanner;
// Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
// Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 202".
// Если пользователь ввёл другое число, программа вообще ничего не должна делать.
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите число 202: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            if (i == 202) {
                System.out.println("Вы ввели число 202");
            }
        } catch (InputMismatchException e) {
            // nothing to do
        }
    }
}
