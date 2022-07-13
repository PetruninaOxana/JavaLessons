package lesson2;

/**
 * Рализация класса для объекта типа "Прямоугольник"
 */
public class Rectangle extends AbstractrShape {
    //private static final Poligon shape = Poligon.RECTANGLE;
   // private final String comment;
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
        shape = Poligon.RECTANGLE;
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
}
