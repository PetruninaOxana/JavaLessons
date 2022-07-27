package lesson3.hashMapExample2;

public class Parrot extends Pet{
    public Parrot(String name) {
        super(name);
    }

    @Override
    String getPetType() {
        return "Попугай";
    }
}
