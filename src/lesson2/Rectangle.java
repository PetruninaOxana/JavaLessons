package lesson2;

/**
 * ��������� ���������� ��� ������ ���� "�������������"
 */
public class Rectangle implements Shape{
    private static String name = "�������������";
    private int shortSideLength;
    private int longSideLength;

    /**
     * ������� ������
     * @param shortSideLength ����� �������� �������
     * @param longSideLength ����� ������� �������
     */
    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
    }

    @Override
    public int getPerimeterLength() {
        return (shortSideLength+longSideLength)*2;
    }

    @Override
    public int getAreaSize() {
        return shortSideLength*longSideLength;
    }

    @Override
    public String getType() {
        return null;
    }
}
