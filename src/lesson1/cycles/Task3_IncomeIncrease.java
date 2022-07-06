package lesson1.cycles;

/*
 �������� ���������, ������� ����������� ��� �������� ������ ����� �� $1000,
         ��������� ����� while/ do ... while, for. (��� ��� ����������)

*/
public class Task3_IncomeIncrease {

    // do-while
    public long monthlyIncreaseDoWhile(int month) {
        long salary = 1000; // ��������� ������
        do {
            month--;
            salary += 1000;
        } while (month > 0);
        return salary;
    }

    // while loop
    public long monthlyIncreaseWhileLoop(int month) {
        long salary = 1000; // ��������� ������
        while (month > 0) {
            month--;
            salary += 1000;
        }
        return salary;
    }

    // for loop
    public long monthlyIncreaseForLoop(int month) {
        long salary = 1000; // ��������� ������
        for (int m = month; m > 0; m--) {
            salary += 1000;
        }
        return salary;
    }

    public static void main(String[] args) {
        int m = 12; // months
        Task3_IncomeIncrease t = new Task3_IncomeIncrease();
        System.out.println("�������� ����� " + m + " ������� �������� " + t.monthlyIncreaseDoWhile(m) + " ������� ������� ���");
        System.out.println("�������� ����� " + m + " ������� �������� " + t.monthlyIncreaseWhileLoop(m) + " ������� ������� ���");
        System.out.println("�������� ����� " + m + " ������� �������� " + t.monthlyIncreaseForLoop(m) + " ������� ������� ���");
    }
}
