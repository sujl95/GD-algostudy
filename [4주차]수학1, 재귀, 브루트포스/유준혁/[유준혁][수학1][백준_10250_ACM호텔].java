package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/10250 ACMȣ��
/*
 * ���� ���� �ؼ�
 * --------------------------------
 * �������� ���� �� �ϼ������� ���������Ϳ��� �� ������ �Ⱦ��Ѵ�.
 * ������ ������ ���������Ͱ� ���� ���̹Ƿ� �������� ���� ����� ������ ������� �������ָ� �ȴ�.
 * �������� �����Ѵ�� n ��° �մ��� ȣ���� ���̷� ���� ���� ����, �������� ���ǿ� ������ �� ���̴�.
 * �� ���� Ư�� ���̽��δ� �������� 0��, �� �������� ������ �ϼ����� �� ����� ���� ������ �����ް� �� ���̴�.
 * 
 * ���������� ��°��� ������ ���ϴ´�� ������ ���־�� �Ѵٴ� �͸� ��������.
 */
public class baekjoon_10250 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		for (int i = 0; i < r; i++) {
			int h = sc.nextInt();
			sc.nextInt();
			int n = sc.nextInt();
			int nmg = n % h;
			if (nmg == 0)
				System.out.printf("%d%02d\n", h, n / h);
			else
				System.out.printf("%d%02d\n", n % h, n / h + 1);
		}
	}
}
