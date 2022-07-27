package lesson3.hashMapExample2;

import java.util.HashMap;
import java.util.Iterator;

public class Processor {
    private final HashMap<String, Pet> petMap = new HashMap<>();

    /**
     * Выводит сообщение в stderr
     * @param str - сообщение
     */
    void logError(String str) {
        System.err.println(str);
    }

    /**
     * Помещаем домашнее животное в список
     * @param pet объект типа Pet
     * @return true если успешно поместилось, false - если такое имя уже было
     */
    public boolean addPet(Pet pet){
        boolean result=true;
        if (petMap.put(pet.getName(), pet) != null) {
            logError("Домашнее животное с именем "+pet.getName()+ " уже есть!");
            result = false;
        }
        return result;
    }

    /**
     * Выводим список животных
     */
    public void listOfPet() {
        for (String name : petMap.keySet()) {
            System.out.println(petMap.get(name));
        }
    }
}
