package lesson2;

public class Main {
    public static void main(String[] args) {
        Shape x = new Square(5);
        System.out.println("��� ������: "+x.getType());
        System.out.println("������� ������: "+x.getAreaSize());
        System.out.println("�������� ������: "+x.getPerimeterLength());

        x = new Rectangle(4, 5);
        System.out.println("��� ������: "+x.getType());
        System.out.println("������� ������: "+x.getAreaSize());
        System.out.println("�������� ������: "+x.getPerimeterLength());
    }
}
