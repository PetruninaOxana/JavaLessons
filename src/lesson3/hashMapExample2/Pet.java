package lesson3.hashMapExample2;

public abstract class Pet {
    private final String name; // ��� ��������� ���������

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * ���������� ��� ��������� ���������
     * @return ��� (���, ������ � �.�.)
     */
    abstract String getPetType();

    @Override
    public String toString() {

        return '{'+getPetType() +
                " �� ����� '" + name + '\'' +
                '}';
    }
}
