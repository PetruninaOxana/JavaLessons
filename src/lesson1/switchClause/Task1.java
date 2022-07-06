package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���������� �������� ���������, ��� �� ������������ ������������ ������ ����� �� �����: 7, 3 ��� 2,
// � ��������� ������ �������, ����� ����� ��� ������������: 7, 3, ��� 2.
public class Task1 {
    public static final int INT_7 = 7;
    public static final int INT_3 = 3;
    public static final int INT_2 = 2;

    public static void main(String[] args) {
        System.out.print("������� ���� �� ����� - " + INT_7 + ", " + INT_3 + " ��� " + INT_2 + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_2:
                case INT_3:
                case INT_7:
                    System.out.println("�� ����� ����� " + i);
                    break;
                default:
                    System.out.println("��������� ����� �� �� �������� ������� " + INT_7 + ", " + INT_3 + " ��� " + INT_2);
                    break;
            }

        } catch (InputMismatchException e) {
            System.err.println("�� ����� �� �����!");
            return;
        }
    }
}
