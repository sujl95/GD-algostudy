package study1;

/*
 * ù° �ٿ� N�� �־�����. 
 * N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
 * ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
 * ���� �־��� ���� 10���� �۴ٸ� 
 * 		�տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�
 * �־��� ���� ���� ������ �ڸ� ����
 *  	�տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�
 *  26���� �����Ѵ�. 
 *  2+6 = 8�̴�. 
 *  ���ο� ���� 68�̴�. 
 *  6+8 = 14�̴�. 
 *  ���ο� ���� 84�̴�. 
 *  8+4 = 12�̴�. 
 *  ���ο� ���� 42�̴�. 
 *  4+2 = 6�̴�. 
 *  ���ο� ���� 26�̴�.
 */
import java.util.*;

public class Main_1110 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int number = n;
		int cycle=0;
		do{
			number = number%10*10+(number/10+number%10)%10;
			cycle++;
		}while(n!=number);
		System.out.println(cycle);
	}
}
