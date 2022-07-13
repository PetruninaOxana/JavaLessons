package lesson2;

/**
 * Enum ����� ��� ����������� ����� �������� Shape
 * @TODO ������� �������� � ResourceBundle
 */

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
                throw new IllegalStateException("����������� ��� ������: " + this);
        }
    }
}
