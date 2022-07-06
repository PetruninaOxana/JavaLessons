package lesson1.ifelse;

import java.util.Scanner;
// Необходимо написать программу, где бы пользователю предлагалось ввести число  101.
// Если пользователь ввёл число 101, программа должна вывести сообщение: "Вы ввели число 101".
// Если пользователь ввёл другое число, программа должна вывести такое сообщение: "Вы ввели число не равное 101"
public class Task2 {
    public static void main(String[] args) {
        System.out.print ("Введите число 101: " );
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==101) {
            System.out.println("Вы ввели число 101");
        } else {
            System.out.println("Вы ввели число не равное 101");
        }
    }
}
