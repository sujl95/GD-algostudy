package study1;
/*
 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�
 * �Է� 5
 * ���  1
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
