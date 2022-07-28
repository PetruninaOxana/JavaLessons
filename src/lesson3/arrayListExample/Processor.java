package lesson3.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Основной класс обработки
 */
public class Processor {

    final private ArrayList<Box>  boxArray = new ArrayList<>();
    final private ArrayList<Box> heavyBoxArray = new ArrayList<>();

    /**
     * Добавляем коробку в начальную очередь
     * @param box - Объект типа Box
     */
    public void addBox(Box box) {
        boxArray.add(box);
    }


    public ArrayList<Box> getBoxArray() {
        return boxArray;
    }

    public ArrayList<Box> getHeavyBoxArray() {
        return heavyBoxArray;
    }

    /*
     * Провереям весь массив boxArray на предмет наличия коробок легче 300 грамм
    public void process() {

        /*
        Используются итераторы, т.к. for и forEach (но можно испольховать вариант
        List<String> names = ....
            for (i=names.size()-1;i>=0;i--) {
            // Do something
             names.remove(i);
        }
        https://stackoverflow.com/questions/223918/iterating-through-a-collection-avoiding-concurrentmodificationexception-when-re
        https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java

        for (Iterator<Box> iterator = boxArray.iterator(); iterator.hasNext();) {
            Box box = iterator.next();
            if (box.getWeight() > 300) {
                // помещаем найденный обънек в другой список
                heavyBoxArray.add(box);
                // Remove the current element from the iterator and the boxArray.
                iterator.remove();
            }
        }
    }
   */

    /**
     * Провереям весь массив boxArray на предмет наличия коробок легче 300 грамм
     * Реализация через forEach. Самый быстрый из проверенных вариантов (на выборке 30000 объектов)
     */
    public void process() {
        final ArrayList<Box> lightBoxArray = new ArrayList<>(boxArray.size());
        heavyBoxArray.clear();
        boxArray.forEach(box -> {
            if (box.getWeight() > 300) {
                // помещаем найденный обънек в другой список
                heavyBoxArray.add(box);
            } else {
                lightBoxArray.add(box);
            }
        });
        boxArray.clear();
        boxArray.addAll(lightBoxArray);
        lightBoxArray.clear();
    }
}
