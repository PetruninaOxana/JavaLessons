package lesson2;

public class Square extends AbstractrShape {
    private final int sideSize;

    /**
     * Объект типа квадрат
     * @param sideSize размер стороны квадрата
     */
    public Square(int sideSize) {
        this.sideSize = sideSize;
        comment = "Размер стороны T = "+sideSize;
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
