package lesson1.ifelse;

import java.util.Scanner;

// ���������� �������� ���������, ��� �� ������������ ������������ ������ ����� �� �����: 5, 4 ��� 1,
// � ��������� ������ �������, ����� ����� ��� ������������: 5, 4, ��� 1.
public class Task1 {
    public static void main(String[] args) {
        System.out.print ("������� ���� �� ����� - 5, 4 ��� 1: " );
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if ((i==1)||(i==4)||(i==5)) {
            System.out.println("�� ������� ����� "+i);
        } else {
            System.out.println("��������� ����� �� �� �������� 1,4 ��� 5");
        }
    }
}
