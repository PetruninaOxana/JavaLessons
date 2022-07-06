package lesson1.cycles;

/*
�������� ������ � ����� ������ ������ � ������� �� ����� ��������� ������ ���� ����������� ������� ������ �� ��������.
References: https://comaqa.gitbook.io/java-automation/yazyk-java.-osnovy/stroki
 */
public class Task2_StringFunctions {
    public static void main(String[] args) {
        String str = "��������� ������ ����������";
        String strAnother = "��������� ������ ����������";
        String strUpper = "��������� ������ ����������";
        char[] word1 = new char[6];

        System.out.println("����� ������: " + str.length());
        System.out.println("��� ������ �����? (true/false): " + str.isEmpty());
        System.out.println("����� ������ � 10 ������� ������: " + str.charAt(10));

        //�������� ����� ������, ��������� ������� getChars
        str.getChars(10, 16, word1, 0);
        // �������� �������� �������� ������, ����� ���������� ����������
        System.out.println("���: " + new String(word1));

        //��������� ���� ���������� �����
        System.out.println("������ str � strAnother ���������? " + str.equals(strAnother));
        //��������� ���� ����� � ������ ���������
        System.out.println("������ str � strUpper ���������? " + str.equals(strUpper));
        // ���������� ��� ������, ��������� �������
        System.out.println("������ str � strUpper ���������, ���� ������������ �������? " + str.equalsIgnoreCase(strUpper));

        System.out.println("������ ����� � ������ - \"���������\"? " + str.startsWith("���������"));
        System.out.println("��������� ����� � ������ - \"����������\"? " + str.endsWith("����������"));

        String firstName = "������";
        String lastName = "����������";
        System.out.println("��������� ������������ ���� �����: " + firstName.concat(" ".concat(lastName)));

        System.out.println("������ str �������� ����� \"������\"? " + str.toLowerCase().contains("������".toLowerCase()));

        System.out.println(str.replace("����������", "- the best!!!").replace("��������� ", ""));
    }

}
