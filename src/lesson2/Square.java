package lesson2;

public class Square implements Shape {
    private final int sideSize;
    private static final Poligon shape = Poligon.SQUARE;
    private final String comment;

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

    @Override
    public String getType() {
        return shape.getType();
    }

    @Override
    public String getComment() {
        return comment;
    }
}
