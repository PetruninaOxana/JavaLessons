package lesson2;

public enum Poligon {
    SQUARE,
    RECTANGLE,
    REGULARGEXAGON;

    public String getType() {
        switch (this ) {
            case RECTANGLE: return "�������������";
            case SQUARE: return "�������";
            case REGULARGEXAGON: return "���������� �������������";
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}
