package lesson3.arrayListExample;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Работа с ArrayList:
 * 1.	Создать ArrayList, содержащий объекты Box. (Объект Box имеет поля вес, высота, широта, глубина)
 * 2.	Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
 * 3.	Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
 */
public class Main {
    public static void main(String[] args) {
        Processor pr = new Processor();
        //Создаем тестовый набор
        for (Box box1 : Arrays.asList(new Box(400, 20, 20, 20),
                new Box(200, 10, 40, 12),
                new Box(600, 20, 20, 40),
                new Box(100, 30, 10, 20),
                new Box(700, 70, 70, 20),
                new Box(300, 70, 30, 20))) {
            pr.addBox(box1);
        }
        // Обрабатываем очередь
        pr.process();

        ArrayList<Box> boxArray = pr.getBoxArray();
        System.out.println("Список коробок до 300 грамм (включительно)");
        boxArray.forEach(box -> System.out.println("Box - Вес: "+box.getWeight()+" длина:"+box.getLength()+" ширина:" + box.getWidth() + " глубина: " + box.getHeight()));
        System.out.println("Список коробок c весом более 300 грамм");
        boxArray = pr.getHeavyBoxArray();
        boxArray.forEach(box -> System.out.println("Box - Вес: "+box.getWeight()+" длина:"+box.getLength()+" ширина:" + box.getWidth() + " глубина: " + box.getHeight()));
    }
}
