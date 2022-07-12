package lesson2;

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
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}
