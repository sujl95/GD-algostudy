package workspace;
import java.util.*;
class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c && a==c) { //3���� ���� ��� ���� ��� �� �� �ƹ��ų� ���
			System.out.println(a);
			return;
		}else if (a==b) { // 2���� ���� ���� ��� �� �� �ϳ� ���
			System.out.println(a);
			return;
		}else if (b==c) { // 2���� ���� ���� ��� �� �� �ϳ� ���
			System.out.println(b);
			return;
		}else if (a==c) { // 2���� ���� ���� ��� �� �� �ϳ� ���
			System.out.println(a);
			return;
		}else { // �� ���� ��� �ٸ� ���
			int min = (a < b && a < c)? a : b < c ? b : c; // a�� b�� c �� ���� �۴ٸ� a��, �ƴ϶�� b�� c �� �� ���� ����
			int max = (a > b && a > c)? a : b > c ? b : c; // a�� b�� c �� ���� ũ�ٸ� a��, �ƴ϶�� b�� c �� �� ū ����
			if(min < a && a < max) System.out.println(a);
			if(min < b && b < max) System.out.println(b);
			if(min < c && c < max) System.out.println(c);
		}
	}
}
