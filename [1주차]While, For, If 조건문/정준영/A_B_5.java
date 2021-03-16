package chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class A_B_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = 0;
		int b = 0;
		
		while(true) {
			a = scan.nextInt();
			b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}
			else {
				list.add(a + b);
			}
		}
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
