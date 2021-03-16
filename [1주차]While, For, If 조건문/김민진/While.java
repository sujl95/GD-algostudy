package first;

import java.util.Scanner;

//백준 while문 10951번 A+B -4 문제
public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
	}
}
