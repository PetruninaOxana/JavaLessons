package lesson2;

public interface Shape {
    public static String name = "Shape";

    /**
     * ���������� ����� ��������� ������
     *
     * @return ����� ���������
     */
    int getPerimeterLength();

    /**
     * ��������� � ���������� ������� ������
     *
     * @return ������� ������
     */
    int getAreaSize();

    /**
     * ���������� ��� ������
     *
     * @return ��� ������
     */
    String getType();
}
