package lesson3.arrayListExample;

/**
 * ������ Box -
 */
public class Box {
    private final int weight; // ��� � �������
    private final int length; // ����� � �����������
    private final int width; // ������ � �����������
    private final int height; // ������� � �����������

    /**
     *
     * @param weight - ��� (� �������)
     * @param length - ������ (� �����������)
     * @param width - ������ (� �����������)
     * @param height - ������ (� �����������)
     */
    public Box(int weight, int length, int width, int height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
