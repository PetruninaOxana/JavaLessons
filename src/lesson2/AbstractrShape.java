package lesson2;

/**
 * Абстрактный класс  интерфейса Shape
 */
public abstract class AbstractrShape implements Shape {
    protected Poligon shape;
    protected String comment;

    @Override
    public abstract int getPerimeterLength();

    @Override
    public abstract int getAreaSize();

    @Override
    public String getType() {
        return shape.getType();
    }

    @Override
    public String getComment() {
        return comment;
    }
}
