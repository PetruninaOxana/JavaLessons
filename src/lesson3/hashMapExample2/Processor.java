package lesson3.hashMapExample2;

import java.util.HashMap;
import java.util.Iterator;

public class Processor {
    private final HashMap<String, Pet> petMap = new HashMap<>();

    /**
     * ������� ��������� � stderr
     * @param str - ���������
     */
    void logError(String str) {
        System.err.println(str);
    }

    /**
     * �������� �������� �������� � ������
     * @param pet ������ ���� Pet
     * @return true ���� ������� �����������, false - ���� ����� ��� ��� ����
     */
    public boolean addPet(Pet pet){
        boolean result=true;
        if (petMap.put(pet.getName(), pet) != null) {
            logError("�������� �������� � ������ "+pet.getName()+ " ��� ����!");
            result = false;
        }
        return result;
    }

    /**
     * ������� ������ ��������
     */
    public void listOfPet() {
        for (String name : petMap.keySet()) {
            System.out.println(petMap.get(name));
        }
    }
}
