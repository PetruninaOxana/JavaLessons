package lesson2;

public abstract class AbstractrShape implements Shape {
    protected String name;
    protected String comment;

    @Override
    public abstract int getPerimeterLength();

    @Override
    public abstract int getAreaSize();

    @Override
    public String getType() {
        return name;
    }

    @Override
    public String getComment() {
        return comment;
    }
}
