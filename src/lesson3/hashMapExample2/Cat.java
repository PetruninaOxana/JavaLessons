package lesson3.hashMapExample2;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    String getPetType() {
        return "Кот";
    }
}
