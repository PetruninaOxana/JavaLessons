package lesson2;

/**
 * Рализация интерфейса для объета типа "Прямоугольник"
 */
public class Rectangle implements Shape{
    private static String name = "Прямоугольник";
    private int shortSideLength;
    private int longSideLength;

    /**
     * Создаем объект
     * @param shortSideLength длина короткой стороны
     * @param longSideLength длина длинной стороны
     */
    public Rectangle(int shortSideLength, int longSideLength) {
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;
    }

    @Override
    public int getPerimeterLength() {
        return (shortSideLength+longSideLength)*2;
    }

    @Override
    public int getAreaSize() {
        return shortSideLength*longSideLength;
    }

    @Override
    public String getType() {
        return null;
    }
}
