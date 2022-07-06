package lesson1.cycles;

/*
 Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
         используя циклы while/ do ... while, for. (Все три реализации)

*/
public class Task3_IncomeIncrease {

    // do-while
    public long monthlyIncreaseDoWhile(int month) {
        long salary = 1000; // начальная ставка
        do {
            month--;
            salary += 1000;
        } while (month > 0);
        return salary;
    }

    // while loop
    public long monthlyIncreaseWhileLoop(int month) {
        long salary = 1000; // начальная ставка
        while (month > 0) {
            month--;
            salary += 1000;
        }
        return salary;
    }

    // for loop
    public long monthlyIncreaseForLoop(int month) {
        long salary = 1000; // начальная ставка
        for (int m = month; m > 0; m--) {
            salary += 1000;
        }
        return salary;
    }

    public static void main(String[] args) {
        int m = 12; // months
        Task3_IncomeIncrease t = new Task3_IncomeIncrease();
        System.out.println("Зарплата через " + m + " месяцев составит " + t.monthlyIncreaseDoWhile(m) + " зеленых бумажек США");
        System.out.println("Зарплата через " + m + " месяцев составит " + t.monthlyIncreaseWhileLoop(m) + " зеленых бумажек США");
        System.out.println("Зарплата через " + m + " месяцев составит " + t.monthlyIncreaseForLoop(m) + " зеленых бумажек США");
    }
}
