package lesson2;

public class Main {
    public static void main(String[] args) {
        // �������������
        Shape[] shapes = {
                new RegularHexagon(4), // ���������� ���������� ������������� ����� ������ ������� (��������� � �������� ��������� ����������
                new Rectangle(4, 5), // ���������� ������������� ����� �������� � ������ �������
                new Square(5) // ���������� ������� ����� ������ �������
        };

        // ������� ����������
        final String formatString = "| %-27s | %12s | %12s | %s%n";
        System.out.printf(formatString,"��� ������","�������", "��������","�����������");
        for (Shape shape : shapes) {
            System.out.printf(formatString,shape.getType(),shape.getAreaSize(), shape.getPerimeterLength(), shape.getComment());
            //System.out.println();
            //System.out.println("��� ������: "+shape.getType());
            //System.out.println("������� ������: "+shape.getAreaSize());
            //System.out.println("�������� ������: "+shape.getPerimeterLength());
        }
    }
}
