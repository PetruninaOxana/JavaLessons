package lesson1.cycles;

//  �������� ���������, ������� ������� �� ����� �5,4,3,2,1� ��������� ���� for.
public class Task5_ForCycle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("�");
        for (int i = 5; i > 0; i--) {
            sb.append(i);
            if (i > 1) {
                sb.append(",");
            }
        }
        sb.append("�");
        System.out.println(sb);
    }

}
