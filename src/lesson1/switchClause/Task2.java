package lesson1.switchClause;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���������� �������� ���������, ��� �� ������������ ������������ ������ �����  202.
// ���� ������������ ��� ����� 202, ��������� ������ ������� ���������: "�� ����� ����� 202".
// ���� ������������ ��� ������ �����, ��������� ������ ������� ����� ���������: "�� ����� ����� �� ������ 202"
public class Task2 {
    public static final int INT_202 = 202;

    public static void main(String[] args) {
        System.out.print("������� ����� - " + INT_202+ ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();

            switch (i) {
                case INT_202:
                    System.out.println("�� ����� ����� " + i);
                    break;
                default:
                    System.out.println("�� ����� ����� �� ������ " + INT_202);
                    break;
            }

        } catch (InputMismatchException e) {
            System.err.println("�� ����� �� �����!");
            return;
        }

    }
}
