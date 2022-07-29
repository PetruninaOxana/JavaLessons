package lesson3.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * �������� ����� ���������
 */
public class Processor {
    final private ArrayList<Box>  boxArray = new ArrayList<>();
    final private ArrayList<Box> heavyBoxArray = new ArrayList<>();
    final private ArrayList<Box> lightBoxArray = new ArrayList<>();

    /**
     * ��������� ������� �� ������� �������
     * @param box - ������ ���� Box
     */
    public void addBox(Box box) {
        boxArray.add(box);
    }

    public ArrayList<Box> getHeavyBoxArray() {
        return heavyBoxArray;
    }
    public ArrayList<Box> getLightBoxArray() {
        return lightBoxArray;
    }

    /**
     * ��������� ���� ������ boxArray �� ������� ������� ������� ����� 300 �����
     * ������������ ����� Stream API, ����� �������� �� ������, �� ��� ��������� � ����� ��������� (��.  ProcessorTest)
     */
    public void process() {
        lightBoxArray.addAll(boxArray.stream().filter(x->x.getWeight()<=300).collect(Collectors.toList()));
        heavyBoxArray.addAll(boxArray.stream().filter(x->x.getWeight()>300).collect(Collectors.toList()));
        boxArray.clear(); // ������� ������� �������
    }

    /**
     * ��������� ���� ������ boxArray �� ������� ������� ������� ����� 300 �����
     * ���������� ����� forEach. Test only! (��. ProcessorTest)
     */
    public void processForEach() {
        boxArray.forEach(box -> {
            if (box.getWeight() > 300) {
                // �������� ��������� ������ � �������������� ������
                heavyBoxArray.add(box);
            } else {
                lightBoxArray.add(box);
            }
        });
        boxArray.clear(); // ������� ������� �������
    }


    /**
     * ��������� ���� ������ boxArray �� ������� ������� ������� ����� 300 ����� (������ �������)
     * Test only! (��. ProcessorTest)
     */
     public void processIterator() {

        /*
        ������������ ��������� ��� ��� �������������� ���� ���� � �������� �������� �� ������� ������� �����
        ����� ������� ������� ������������ ��� ArrayList (��� �������� � ������� �������� ������, �� �������)
        Test only! (��. ProcessorTest)

        https://stackoverflow.com/questions/223918/iterating-through-a-collection-avoiding-concurrentmodificationexception-when-re
        https://stackoverflow.com/questions/1196586/calling-remove-in-foreach-loop-in-java
        */
        for (Iterator<Box> iterator = boxArray.iterator(); iterator.hasNext();) {
            Box box = iterator.next();
            if (box.getWeight() > 300) {
                // �������� ��������� ������ � ������ ������� �������
                heavyBoxArray.add(box);
                // Remove the current element from the iterator and the boxArray.
                //iterator.remove();
            } else {
                // �������� ��������� ������ � ������ ������ �������
                lightBoxArray.add(box);
            }
        }
        boxArray.clear(); // ������� ������� �������
    }

    public void processSimple() {
        for (int i=boxArray.size()-1;i>=0;i--) {
            if (boxArray.get(i).getWeight() > 300) {
                // �������� ��������� ������ � ������ ������� �������
                heavyBoxArray.add(boxArray.get(i));
                // Remove the current element from the iterator and the boxArray.
                //iterator.remove();
            } else {
                // �������� ��������� ������ � ������ ������ �������
                lightBoxArray.add(boxArray.get(i));
            }
        }
        boxArray.clear(); // ������� ������� �������
    }

}
