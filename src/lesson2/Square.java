package lesson2;

public class Square implements Shape {
    private final int sideSize;
    private static final String name = "Квадрат";

    /**
     * Объект типа квадрат
     * @param sideSize размер стороны квадрата
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
