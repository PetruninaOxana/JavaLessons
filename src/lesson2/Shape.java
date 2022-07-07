package lesson2;

public interface Shape {
    public static String name = "Shape";

    /**
     * ¬озвращает длину периметра фигуры
     *
     * @return длина периметра
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
