package first;

import java.util.Scanner;

// ���� for�� 2438�� �����-1 ����
public class For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String star = "";
		
		for(int i=0; i<n;i++) {
			star += "*";
			System.out.println(star);
		}
	}
}
