package lesson3.hashMapExample2;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    String getPetType() {
        return "Собака";
    }
}
