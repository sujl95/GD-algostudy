package baekjoon_math1_yjh;
import java.util.*;
// ���� ��� ������ Recursion( ����Լ� ) �����̴�.
// ������ �ڼ��� Ǯ�̹��� �Ϲ� �ݺ��� �ʿ� ������ �س����� �����ϸ� �ȴ�.
public class baekjoon_2839_recursion {
	static int func(int n) {
		if(n < 0) return -9999; 
		// return -1; �� �ϰ� �Ǹ� 4�� �Է����� ��� ���� ���� 2���� -1 �� 1�� ���� �����Ѵ�. ( ��Ȯ�� Ȯ�� �Ұ� )
		// �׷��� ���� ���ǿ� ���� �ִ� 1000�� ���� ū -9999�� ���༭ Ȯ�� �����ϵ��� �������.
		if(n % 5 == 0) return n / 5;
		return 1 + (func(n - 3));
	}
	public static void main(String[] args) {
		int cnt = func(new Scanner(System.in).nextInt());
		System.out.println(cnt < 0 ? -1 : cnt);
	}
}
