package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���������� �������� ���������, ��� �� ������������ ������������ ������ �����  303.
// ���� ������������ ��� ����� 303, ��������� ������ ������� ���������: "�� ����� ����� 303".
// ���� ������������ ��� ������ �����, ��������� ������ ������ �� ������ ������.
public class Task3 {
    public static final int INT_303 = 303;
    public static void main(String[] args) {
        System.out.print("������� ����� - " + INT_303 + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_303:
                    System.out.println("�� ����� ����� " + i);
                    break;
                default:
                    // nothing to do
                    break;
            }

        } catch (InputMismatchException e) {
            // nothing to do
            // System.err.println("�� ����� �� �����!");
            //return;
        }

    }
}
