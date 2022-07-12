package lesson2;

/**
 * Рализация интерфейса для объета типа "Прямоугольник"
 */
public class Rectangle implements Shape {
    private static final Poligon shape = Poligon.RECTANGLE;
    private final String comment;
    private final int shortSideLength;
    private final int longSideLength;

    /**
     * Создаем объект
     *
     * @param shortSideLength длина короткой стороны
     * @param longSideLength  длина длинной стороны
     */
    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
        comment = "Короткая сторона Tmin = " + this.shortSideLength + ", длинная сторона Tmax = " + longSideLength;
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
