package baekjoon_math1_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/1712 ���ͺб���
public class baekjoon_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // �⺻��
		int x = (sc.nextInt() - sc.nextInt()) * -1; // 1���� �Ǹ� ����
		System.out.println(x <= 0 ? -1 : (a / x + 1)); // �Ǹ� ������ 0���� �۴ٸ� ���ͺб����� ������ �� ����.
		// ������ �߻��Ϸ���  a / x ���� Ŀ����. ���� + 1
	}
}
