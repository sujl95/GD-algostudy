package step2;

import java.util.Scanner;

public class ba20191024_2 {

	public static void main(String[] args) {
		/* 
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

			하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
