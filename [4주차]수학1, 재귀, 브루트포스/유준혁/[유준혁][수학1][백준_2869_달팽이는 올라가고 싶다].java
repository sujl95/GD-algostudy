package baekjoon_math1_yjh;
import java.util.*;
// acmicpc.net/problem/2869
// ------------------------
// ���ͺб��� ������ ����ϴ�.
// ���ڵ��� �븮�� �����̶� �̷������� Ǯ���µ� �������� Ǯ� �������.
// ��. �Է��� 10�� ���� ������ �ǹǷ� �Ϲ� �ݺ������� Ǯ�� �Ǹ� �ð��ʰ��� ���״� ��������.
// �ݺ����� Ƚ���� ���̵��� ��Ģ�� �ܼ�ȭ ��Ű�� ����� �����غ��� �ȴ�.
public class baekjoon_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt();
		System.out.println((int) Math.ceil((double) (x - a) / (a - b)) + 1);
	}
}
