package lesson2;

public interface Shape {

    /**
     * ¬ычисл€ет и возвращает размер периметра фигуры
     *
     * @return размер периметра
     */
    int getPerimeterLength();

    /**
     * ¬ычисл€ет и возвращает площадь фигуры
     *
     * @return площадь фигуры
     */
    int getAreaSize();

    /**
     * ¬озвращает им€ фигуры
     *
     * @return им€ фигуры
     */
    String getType();
}
