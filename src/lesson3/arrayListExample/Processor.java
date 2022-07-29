package lesson3.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Основной класс обработки
 */
public class Processor {
    final private ArrayList<Box>  boxArray = new ArrayList<>();
    final private ArrayList<Box> heavyBoxArray = new ArrayList<>();
    final private ArrayList<Box> lightBoxArray = new ArrayList<>();

    /**
     * Добавляем коробку во входную очередь
     * @param box - Объект типа Box
     */
    public void addBox(Box box) {
        boxArray.add(box);
    }

    public ArrayList<Box> getHeavyBoxArray() {
        return heavyBoxArray;
    }
    public ArrayList<Box> getLightBoxArray() {
        return lightBoxArray;
    }

    /**
     * Провереям весь массив boxArray на предмет наличия коробок легче 300 грамм
     * Реализованно через Stream API, самый короткий по записи, но как оказалось и самый медленный (см.  ProcessorTest)
     */
    public void process() {
        lightBoxArray.addAll(boxArray.stream().filter(x->x.getWeight()<=300).collect(Collectors.toList()));
        heavyBoxArray.addAll(boxArray.stream().filter(x->x.getWeight()>300).collect(Collectors.toList()));
        boxArray.clear(); // очищаем входную очередь
    }

    /**
     * Провереям весь массив boxArray на предмет наличия коробок легче 300 грамм
     * Реализация через forEach. Test only! (см. ProcessorTest)
     */
    public void processForEach() {
        boxArray.forEach(box -> {
            if (box.getWeight() > 300) {
                // помещаем найденный объект в соответсвующий список
                heavyBoxArray.add(box);
            } else {
                lightBoxArray.add(box);
            }
        });
        boxArray.clear(); // очищаем входную очередь
    }


    /**
     * Провереям весь массив boxArray на предмет наличия коробок легче 300 грамм (первый вариант)
     * Test only! (см. ProcessorTest)
     */
     public void processIterator() {

        /*
        Используются итераторы так как первоначальная идея была в удалении объектов из входной очереди сразу
        Потом принято решение использовать три ArrayList (что приводит к большим расходам пямяти, но быстрее)
        Test only! (см. ProcessorTest)

        https://stackoverflow.com/questions/223918/iterating-through-a-collection-avoiding-concurrentmodificationexception-when-re
        https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java
        */
        for (Iterator<Box> iterator = boxArray.iterator(); iterator.hasNext();) {
            Box box = iterator.next();
            if (box.getWeight() > 300) {
                // помещаем найденный объект в список тяжелых коробок
                heavyBoxArray.add(box);
                // Remove the current element from the iterator and the boxArray.
                //iterator.remove();
            } else {
                // помещаем найденный объект в список легких коробок
                lightBoxArray.add(box);
            }
        }
        boxArray.clear(); // очищаем входную очередь
    }

    public void processSimple() {
        for (int i=boxArray.size()-1;i>=0;i--) {
            if (boxArray.get(i).getWeight() > 300) {
                // помещаем найденный объект в список тяжелых коробок
                heavyBoxArray.add(boxArray.get(i));
                // Remove the current element from the iterator and the boxArray.
                //iterator.remove();
            } else {
                // помещаем найденный объект в список легких коробок
                lightBoxArray.add(boxArray.get(i));
            }
        }
        boxArray.clear(); // очищаем входную очередь
    }

}
