package lesson2;

/**
 * Рализация класса для объекта типа "Квадрат"
 */
public class Square extends AbstractrShape {
    private final int sideSize;
   // private final String comment;

    /**
     * Объект типа квадрат
     * @param sideSize размер стороны квадрата
     */
    public Square(int sideSize) {
        this.sideSize = sideSize;
        shape = Poligon.SQUARE;
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
