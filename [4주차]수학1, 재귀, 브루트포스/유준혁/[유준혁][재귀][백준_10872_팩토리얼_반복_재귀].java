package baekjoon_recursion_yjh;
import java.util.*;
// https://www.acmicpc.net/problem/10872 ���丮��
// ��� �Լ� ���� ����.
// �⺻���� ����� ������ ��͸� �ݺ������� ��ȯ�ϴ� ������ �غ��ø� �˴ϴ�.
// ** 0! = 1 �Դϴ�.
// ** 1! = 1 �Դϴ�.
public class baekjoon_10872 {
	// ��͸� ����� ���.
	static int fact(int i) {
		if (i < 2) return 1;
		return i * fact(i - 1);
	}
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		System.out.println(fact(x));
		
		//�ݺ����� ����� ���. ����ϴ� ������ ���� �þ���.
		int rst = 1;
		for(int i = 1; i <= x; i++) rst *= i;
		System.out.println(rst);
	}
}
