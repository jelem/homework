package task1;

import java.util.stream.IntStream;

/**
 * 3. �������� ���������, ��������� �� ����� ��� ���������������
 * �������� ������������������ 90 85 80 75 70 65 60 �.
 */

public class IntSream3 {

    public static void main(String[] args) {
        IntStream.iterate(90, i -> i - 5)
                .limit(18)
                .forEach(e -> System.out.println(e));
    }
}
