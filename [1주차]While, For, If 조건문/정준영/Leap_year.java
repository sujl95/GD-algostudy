package chap2;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if(year <= 4000 && year >= 0) {
			if(year % 4 == 0) {
				if(year % 100 != 0) {
					System.out.println(1);
				}
				else if(year % 400 == 0){
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else {
				System.out.println(0);
			}
		}
		else {
			System.out.println("0 ~ 4000년 사이로 입력해주세요");
		}

	}

}
