package lesson2;

/**
 * ��������� ������ ��� ������� ���� "�������"
 */
public class Square extends AbstractrShape {
    private final int sideSize;
   // private final String comment;

    /**
     * ������ ���� �������
     * @param sideSize ������ ������� ��������
     */
    public Square(int sideSize) {
        this.sideSize = sideSize;
        shape = Poligon.SQUARE;
        comment = "������ ������� T = "+sideSize;
    }

    @Override
    public int getPerimeterLength() {
        return sideSize*4;
    }

    @Override
    public int getAreaSize() {
        return sideSize*sideSize;
    }
}
