package study1;

/*
 * 45�� ���� �˶� ���߱�
 * ù° �ٿ� �� ���� H�� M
 * �Է� �ð��� 24�ð� ǥ���� ����Ѵ�.
 * 
 */
import java.io.*;

public class Main_2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] time= br.readLine().split(" ");
		int h = Integer.parseInt(time[0]);
		int m = Integer.parseInt(time[1]);
		if(m>=45) {
			m=m-45;
		}else {
			--h;
			if(h==(-1)) {
				h=23;
			}
			m=m+15;
		}
		System.out.println(h+" "+m);
		
	}
}
