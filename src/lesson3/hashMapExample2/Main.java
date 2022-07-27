/**
 * Создать HashMap
 * 1.	Создайте класс Pet и его наследников Cat, Dog, Parrot.
 * 2.	Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
 * 3.	Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */
package lesson3.hashMapExample2;

public class Main {

    public static void main(String[] args) {
        Processor pr = new Processor();
        Pet pet = new Cat("Барсик");
        pr.addPet(pet);
        pet = new Parrot("Попка");
        pr.addPet(pet);
        pet = new Dog("Шарик");
        pr.addPet(pet);

        // выведем список животных с их типом
        pr.listOfPet();
    }
}
