package lesson1.ifelse;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���������� �������� ���������, ��� �� ������������ ������������ ������ �����  202.
// ���� ������������ ��� ����� 303, ��������� ������ ������� ���������: "�� ����� ����� 202".
// ���� ������������ ��� ������ �����, ��������� ������ ������ �� ������ ������.
public class Task3 {
    public static void main(String[] args) {
        System.out.print("������� ����� 202: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            if (i == 202) {
                System.out.println("�� ����� ����� 202");
            }
        } catch (InputMismatchException e) {
            // nothing to do
        }
    }
}
