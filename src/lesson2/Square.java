package lesson2;

public class Square extends AbstractrShape {
    private final int sideSize;

    /**
     * ������ ���� �������
     * @param sideSize ������ ������� ��������
     */
    public Square(int sideSize) {
        this.sideSize = sideSize;
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
