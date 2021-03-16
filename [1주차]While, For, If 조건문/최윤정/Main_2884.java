package study1;

/*
 * 45분 일찍 알람 맞추기
 * 첫째 줄에 두 정수 H와 M
 * 입력 시간은 24시간 표현을 사용한다.
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
