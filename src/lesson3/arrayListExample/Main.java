package lesson3.arrayListExample;

import java.util.ArrayList;

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
        pr.addBox(new Box(400, 20, 20, 20));
        pr.addBox(new Box(200, 10, 40, 12));
        pr.addBox(new Box(600, 20, 20, 40));
        pr.addBox(new Box(100, 30, 10, 20));
        pr.addBox(new Box(700, 70, 70, 20));
        pr.addBox(new Box(300, 70, 30, 20));

        pr.process();
        ArrayList<Box> boxArray = pr.getBoxArray();
        System.out.println("������ ������� �� 300 ����� (������������");
        boxArray.forEach(box -> System.out.println("Box - ���: "+box.getWeight()+" �����:"+box.getLength()+" ������:" + box.getWidth() + " �������: " + box.getHeight()));
        System.out.println("������ ������� c ����� ����� 300 �����");
        boxArray = pr.getHeavyBoxArray();
        boxArray.forEach(box -> System.out.println("Box - ���: "+box.getWeight()+" �����:"+box.getLength()+" ������:" + box.getWidth() + " �������: " + box.getHeight()));
    }
}
