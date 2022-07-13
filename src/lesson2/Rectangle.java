package lesson2;

/**
 * ��������� ������ ��� ������� ���� "�������������"
 */
public class Rectangle extends AbstractrShape {
    //private static final Poligon shape = Poligon.RECTANGLE;
   // private final String comment;
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
        shape = Poligon.RECTANGLE;
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
}
