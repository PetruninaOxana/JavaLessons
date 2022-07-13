package lesson2;

/**
 * Enum класс для типов объектов
 */
public interface Shape {

    /**
     * Вычисляет и возвращает размер периметра фигуры
     *
     * @return размер периметра
     */
    int getPerimeterLength();

    /**
     * Вычисляет и возвращает площадь фигуры
     *
     * @return площадь фигуры
     */
    int getAreaSize();

    /**
     * Возвращает имя фигуры
     *
     * @return имя фигуры
     */
    String getType();

    /**
     * Описание фигуры
     * @return описание фигуры
     */
    String getComment();
}
