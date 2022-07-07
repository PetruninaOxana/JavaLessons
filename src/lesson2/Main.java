package lesson2;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new RegularHexagon(4),
                new Rectangle(4, 5),
                new Square(5)
        };

        for (int i=0; i<shapes.length; i++) {
            System.out.println();
            System.out.println("Имя фигуры: "+shapes[i].getType());
            System.out.println("Площадь фигуры: "+shapes[i].getAreaSize());
            System.out.println("Периметр фигуры: "+shapes[i].getPerimeterLength());
        }
    }
}
