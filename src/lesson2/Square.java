package lesson2;

public class Square implements Shape {
    private final int sideSize;
    private static final String name = "�������";

    /**
     * ������ ���� �������
     * @param sideSize ������ ������� ��������
     */
    public Square(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public int getPerimeterLength() {
        return sideSize*4;
    }

    @Override
    public int getAreaSize() {
        return sideSize*sideSize;
    }

    @Override
    public String getType() {
        return name;
    }
}
