package lesson1.cycles;

/*
�������� ���������, ������� ��� ��������� �� � $10000 �� $0 ������ ����� ��������� ����� while/ do ... while, for. (��� ��� ����������).
 */
public class Task4_SalaryDecrease {
    // do-while
    public int monthlyDecreaseDoWhile(long salary) {
        int month = 0; // ��������� �����
        do {
            month++;
            salary -= 1000;
        } while (salary >= 0);
        return month;
    }

    // while loop
    public int monthlyDecreaseWhileLoop(long salary) {
        int month = 0; // ��������� ������

        while (salary >= 0L) {
            month++;
            salary -= 1000;
        }
        return month;
    }

    // for loop
    public int monthlyDecreaseForLoop(long salary) {
        int month = 0;
        for (; salary >= 0; salary -= 1000L) {
            month++;
        }
        return month;
    }

    public static void main(String[] args) {
        long s = 10000L;
        Task4_SalaryDecrease t = new Task4_SalaryDecrease();
        System.out.println("�������� ����� " + t.monthlyDecreaseDoWhile(s) + "������� �������� �������� 0 ������� ������� ���");
        System.out.println("�������� ����� " + t.monthlyDecreaseWhileLoop(s) + " ������� �������� �������� 0 ������� ������� ���");
        System.out.println("�������� ����� " + t.monthlyDecreaseForLoop(s) + " ������� �������� �������� 0 ������� ������� ���");
    }
}
