import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		for(int i=0; i<round; i++) {
			StringBuffer sb = new StringBuffer();
			int cnt = sc.nextInt();
			for(byte b : sc.next().getBytes())
				for(int j=0; j<cnt; j++) sb.append((char)b);
			System.out.println(new String(sb));
		}
	}
}