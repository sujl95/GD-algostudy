package step2;

import java.util.Scanner;

public class ba20191024_1 {

	public static void main(String[] args) {
		/* 
		������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �� �̴�.

		�������, 2012���� 4�� ����� ����������, 1900���� 4�� ���������, 100�� ����̱� ������ ������ �ƴϴ�.

		������, 2000���� 400�� ����̱� ������ �����̴�.
		 * */
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		boolean check = false;
		
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
				check = true;
			}
		}
		
		if(check) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		
	}

}
