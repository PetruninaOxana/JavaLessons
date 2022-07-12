package lesson2;

/**
 * ��������� ���������� ��� ������ ���� "�������������"
 */
public class Rectangle implements Shape {
    private static final Poligon shape = Poligon.RECTANGLE;
    private final String comment;
    private final int shortSideLength;
    private final int longSideLength;

    /**
     * ������� ������
     *
     * @param shortSideLength ����� �������� �������
     * @param longSideLength  ����� ������� �������
     */
    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
        comment = "�������� ������� Tmin = " + this.shortSideLength + ", ������� ������� Tmax = " + longSideLength;
    }

    @Override
    public int getPerimeterLength() {
        return (shortSideLength + longSideLength) * 2;
    }

    @Override
    public int getAreaSize() {
        return shortSideLength * longSideLength;
    }

    @Override
    public String getType() {
        return shape.getType();
    }

    @Override
    public String getComment() {
        return comment;
    }
}
