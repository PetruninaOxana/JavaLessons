package lesson2;

public class Main {
    public static void main(String[] args) {
        // инициализация
        Shape[] shapes = {
                new RegularHexagon(4), // определяеи правильный шкстиугольник через размер стороны (совпадает с радиусом вписанной окружности
                new Rectangle(4, 5), // определяем прямоугольник через короткую и длиную стороны
                new Square(5) // определяем квадрат через размер стороны
        };

        // Выводим результаты
        final String formatString = "| %-27s | %12s | %12s | %s%n";
        System.out.printf(formatString,"Имя фигуры","Площадь", "Периметр","Комментарий");
        for (Shape shape : shapes) {
            System.out.printf(formatString,shape.getType(),shape.getAreaSize(), shape.getPerimeterLength(), shape.getComment());
            //System.out.println();
            //System.out.println("Имя фигуры: "+shape.getType());
            //System.out.println("Площадь фигуры: "+shape.getAreaSize());
            //System.out.println("Периметр фигуры: "+shape.getPerimeterLength());
        }
    }
}
