package step2;

import java.util.Scanner;

public class ba20191024_2 {

	public static void main(String[] args) {
		/* 
		 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

			������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		for(int i = 0;i<num;i++) {
			for(int j = num - i -1;j >0;j--) {
				System.out.print(" ");
			}for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
