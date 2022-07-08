package lesson2;

public class Square implements Shape {
    private final int sideSize;
    private static final String name = "�������";
    private final String comment;

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

    @Override
    public String getType() {
        return name;
    }

    @Override
    public String getComment() {
        return comment;
    }
}
