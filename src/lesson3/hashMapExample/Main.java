package lesson3.hashMapExample;

/**
 * 1.	�������� HashMap, ���������� ���� ��������  - ��� ������� � ������ ������� (����� Product).
 * 2.	��������� � ����������� ���� �������� - entrySet().
 * 3.	��������� � ����������� ����� �� ���� ���������  - keySet().
 * 4.	��������� � ����������� �������� ��������� - values().
 * 5.	��� ������� �������� ������� ���� �����.
 */
public class Main {
    private static final Processor pr = new Processor();

    public static void main(String[] args) {
        //@TODO �������� �������� �� ���������� ��������� ������
        pr.addProduct( new Product("�������", "ART-9091"));
        pr.addProduct( new Product("���������", "HMC-9091"));
        pr.addProduct( new Product("�������� ����", "HMC-9091"));
        pr.addProduct( new Product("����� R2D2 (�������)", "SW-R2D2"));
        pr.addProduct( new Product("����� C3PO (������)", "SW-C3PO"));
        System.out.println("������ ������������� entrySet()\n");
        pr.entrySetExample();

        System.out.println("������ ������������� keySet()\n");
        pr.keySetExample();

        System.out.println("������ ������������� values()\n");
        pr.valuesExample();
    }
}
