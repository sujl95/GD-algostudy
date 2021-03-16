package study1;
/*
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다
 * 입력 5
 * 출력  1
 *     2
 *     3
 *     4
 *     5
 */
import java.io.*;

public class Main_2741 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			bw.write(i+"\n");
		}
		bw.flush();
	}
}
