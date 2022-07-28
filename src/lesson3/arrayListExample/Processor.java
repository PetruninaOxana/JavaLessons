package lesson3.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * �������� ����� ���������
 */
public class Processor {

    final private ArrayList<Box>  boxArray = new ArrayList<>();
    final private ArrayList<Box> heavyBoxArray = new ArrayList<>();

    /**
     * ��������� ������� � ��������� �������
     * @param box - ������ ���� Box
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
     * ��������� ���� ������ boxArray �� ������� ������� ������� ����� 300 �����
    public void process() {

        /*
        ������������ ���������, �.�. for � forEach (�� ����� ������������ �������
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
                // �������� ��������� ������ � ������ ������
                heavyBoxArray.add(box);
                // Remove the current element from the iterator and the boxArray.
                iterator.remove();
            }
        }
    }
   */

    /**
     * ��������� ���� ������ boxArray �� ������� ������� ������� ����� 300 �����
     * ���������� ����� forEach. ����� ������� �� ����������� ��������� (�� ������� 30000 ��������)
     */
    public void process() {
        final ArrayList<Box> lightBoxArray = new ArrayList<>(boxArray.size());
        heavyBoxArray.clear();
        boxArray.forEach(box -> {
            if (box.getWeight() > 300) {
                // �������� ��������� ������ � ������ ������
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
