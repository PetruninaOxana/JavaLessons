package lesson3.hashMapExample;

/**
 * 1.	Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
 * 2.	Перебрать и распечатать пары значений - entrySet().
 * 3.	Перебрать и распечатать набор из имен продуктов  - keySet().
 * 4.	Перебрать и распечатать значения продуктов - values().
 * 5.	Для каждого перебора создать свой метод.
 */
public class Main {
    private static final Processor pr = new Processor();

    public static void main(String[] args) {
        //@TODO добавить проверку на успешность помешения данных
        pr.addProduct( new Product("Медведь", "ART-9091"));
        pr.addProduct( new Product("Чебурашка", "HMC-9091"));
        pr.addProduct( new Product("Крокодил Гена", "HMC-9091"));
        pr.addProduct( new Product("Робот R2D2 (пылесос)", "SW-R2D2"));
        pr.addProduct( new Product("Робот C3PO (желтый)", "SW-C3PO"));
        System.out.println("Пример использования entrySet()\n");
        pr.entrySetExample();

        System.out.println("Пример использования keySet()\n");
        pr.keySetExample();

        System.out.println("Пример использования values()\n");
        pr.valuesExample();
    }
}
