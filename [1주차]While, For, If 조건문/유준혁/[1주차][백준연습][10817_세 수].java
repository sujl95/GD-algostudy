package workspace;
import java.util.*;
class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c && a==c) { //3개의 수가 모두 같은 경우 셋 중 아무거나 출력
			System.out.println(a);
			return;
		}else if (a==b) { // 2개의 수가 같은 경우 둘 중 하나 출력
			System.out.println(a);
			return;
		}else if (b==c) { // 2개의 수가 같은 경우 둘 중 하나 출력
			System.out.println(b);
			return;
		}else if (a==c) { // 2개의 수가 같은 경우 둘 중 하나 출력
			System.out.println(a);
			return;
		}else { // 세 수가 모두 다를 경우
			int min = (a < b && a < c)? a : b < c ? b : c; // a가 b와 c 둘 보다 작다면 a를, 아니라면 b와 c 중 더 작은 것을
			int max = (a > b && a > c)? a : b > c ? b : c; // a가 b와 c 둘 보다 크다면 a를, 아니라면 b와 c 중 더 큰 것을
			if(min < a && a < max) System.out.println(a);
			if(min < b && b < max) System.out.println(b);
			if(min < c && c < max) System.out.println(c);
		}
	}
}
