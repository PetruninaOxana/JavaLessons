/**
 * ������� HashMap
 * 1.	�������� ����� Pet � ��� ����������� Cat, Dog, Parrot.
 * 2.	�������� ����������� �� �������� ��������, ��� � �������� ����� ��������� ��� ���������, � � �������� �������� ����� Pet.
 * 3.	�������� � ����������� ������ ��������. �������� ����� ��������� �� ������� ��� ����� �����������.
 */
package lesson3.hashMapExample2;

public class Main {

    public static void main(String[] args) {
        Processor pr = new Processor();
        Pet pet = new Cat("������");
        pr.addPet(pet);
        pet = new Parrot("�����");
        pr.addPet(pet);
        pet = new Dog("�����");
        pr.addPet(pet);

        // ������� ������ �������� � �� �����
        pr.listOfPet();
    }
}
