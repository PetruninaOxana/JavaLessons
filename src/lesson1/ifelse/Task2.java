package lesson1.ifelse;

import java.util.Scanner;
// ���������� �������� ���������, ��� �� ������������ ������������ ������ �����  101.
// ���� ������������ ��� ����� 101, ��������� ������ ������� ���������: "�� ����� ����� 101".
// ���� ������������ ��� ������ �����, ��������� ������ ������� ����� ���������: "�� ����� ����� �� ������ 101"
public class Task2 {
    public static void main(String[] args) {
        System.out.print ("������� ����� 101: " );
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==101) {
            System.out.println("�� ����� ����� 101");
        } else {
            System.out.println("�� ����� ����� �� ������ 101");
        }
    }
}
