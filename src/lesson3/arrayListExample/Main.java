package lesson3.arrayListExample;

import java.util.Arrays;

/**
 * ������ � ArrayList:
 * 1.	������� ArrayList, ���������� ������� Box. (������ Box ����� ���� ���, ������, ������, �������)
 * 2.	�������� �����, ������� ���������� �������� ��������� � ��������� ��� �������.
 * 3.	���� ��� ������� ������ 300 ��, ������� ������������ � ������ ���������.
 */
public class Main {
    public static void main(String[] args) {
        Processor pr = new Processor();
        //������� �������� �����
        for (Box box1 : Arrays.asList(new Box(400, 20, 20, 20),
                new Box(200, 10, 40, 12),
                new Box(600, 20, 20, 40),
                new Box(100, 30, 10, 20),
                new Box(700, 70, 70, 20),
                new Box(300, 70, 30, 20))) {
            pr.addBox(box1);
        }
        // ������������ �������
        pr.process();

        System.out.println("������ ������� �� 300 ����� (������������)");
        pr.getLightBoxArray().forEach(box -> System.out.println("Box - ���: "+box.getWeight()+" �����:"+box.getLength()+" ������:" + box.getWidth() + " �������: " + box.getHeight()));

        System.out.println("������ ������� c ����� ����� 300 �����");
        pr.getHeavyBoxArray().forEach(box -> System.out.println("Box - ���: "+box.getWeight()+" �����:"+box.getLength()+" ������:" + box.getWidth() + " �������: " + box.getHeight()));
    }
}
