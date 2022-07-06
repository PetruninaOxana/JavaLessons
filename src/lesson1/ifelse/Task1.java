package lesson1.ifelse;

import java.util.Scanner;

// Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 5, 4 или 1,
// а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.
public class Task1 {
    public static void main(String[] args) {
        System.out.print ("Введите одно из чисел - 5, 4 или 1: " );
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if ((i==1)||(i==4)||(i==5)) {
            System.out.println("Вы выбрали число "+i);
        } else {
            System.out.println("Введенное число не не является 1,4 или 5");
        }
    }
}
