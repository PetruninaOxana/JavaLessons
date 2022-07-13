package lesson2;

/**
 * Enum ����� ��� ����� ��������
 */
public interface Shape {

    /**
     * ��������� � ���������� ������ ��������� ������
     *
     * @return ������ ���������
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

    /**
     * �������� ������
     * @return �������� ������
     */
    String getComment();
}
