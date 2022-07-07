package lesson2;

public class Main {
    public static void main(String[] args) {
        Shape x = new Square(5);
        System.out.println("Имя фигуры: "+x.getType());
        System.out.println("Площадь фигуры: "+x.getAreaSize());
        System.out.println("Периметр фигуры: "+x.getPerimeterLength());

        x = new Rectangle(4, 5);
        System.out.println("Имя фигуры: "+x.getType());
        System.out.println("Площадь фигуры: "+x.getAreaSize());
        System.out.println("Периметр фигуры: "+x.getPerimeterLength());
    }
}
