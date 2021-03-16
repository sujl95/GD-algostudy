package chap2;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num >= 1 && num <= 100) {
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num; j++) {
					if(i >= j) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}

	}

}
