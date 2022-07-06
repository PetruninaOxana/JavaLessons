package lesson1.cycles;

/*
Написать программу, которая вам уменьшает зп с $10000 до $0 каждый месяц используя циклы while/ do ... while, for. (Все три реализации).
 */
public class Task4_SalaryDecrease {
    // do-while
    public int monthlyDecreaseDoWhile(long salary) {
        int month = 0; // начальный месяц
        do {
            month++;
            salary -= 1000;
        } while (salary >= 0);
        return month;
    }

    // while loop
    public int monthlyDecreaseWhileLoop(long salary) {
        int month = 0; // начальная ставка

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
        System.out.println("Зарплата через " + t.monthlyDecreaseDoWhile(s) + "месяцев зарплата составит 0 зеленых бумажек США");
        System.out.println("Зарплата через " + t.monthlyDecreaseWhileLoop(s) + " месяцев зарплата составит 0 зеленых бумажек США");
        System.out.println("Зарплата через " + t.monthlyDecreaseForLoop(s) + " месяцев зарплата составит 0 зеленых бумажек США");
    }
}
