package lesson3.hashMapExample2;

public abstract class Pet {
    private final String name; // имя домашнего жевотного

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Возвращает тип томашнего животного
     * @return тип (кот, собака и т.д.)
     */
    abstract String getPetType();

    @Override
    public String toString() {

        return '{'+getPetType() +
                " по имени '" + name + '\'' +
                '}';
    }
}
