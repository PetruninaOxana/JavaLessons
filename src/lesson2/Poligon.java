package lesson2;

/**
 * Enum класс для определения типов объектов Shape
 * @TODO вынести литералы в ResourceBundle
 */

public enum Poligon {
    SQUARE,
    RECTANGLE,
    REGULARGEXAGON;

    public String getType() {
        switch (this ) {
            case RECTANGLE: return "Прямоугольник";
            case SQUARE: return "Квадрат";
            case REGULARGEXAGON: return "Правильный шестиугольник";
            default:
                throw new IllegalStateException("Неизвестный тип фигуры: " + this);
        }
    }
}
