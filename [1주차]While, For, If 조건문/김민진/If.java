package first;

import java.util.Scanner;

//백준 if문 2753번 윤년문제
public class If {
	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		if( year%4 == 0 && year%100 != 0 || year%400==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}