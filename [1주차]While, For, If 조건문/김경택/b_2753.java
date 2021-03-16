package if_study;

import java.util.Scanner;

public class b_2753 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		if(a%4==0&&a%100!=0||a%400==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
