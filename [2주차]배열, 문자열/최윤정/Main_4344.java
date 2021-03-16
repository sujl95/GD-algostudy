package study2;


/*
 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
 * ��° �ٺ��� �� �׽�Ʈ ���̽�����
 * �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,
 * �̾ N���� ������ �־�����. 
 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 * 
 * �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ�
 * �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */
import java.io.*;

public class Main_4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int c = Integer.parseInt(br.readLine());
		for (int i = 0; i < c; i++) {
			int sum = 0;
			double avg = 0.0;
			int cnt=0;
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			for (int j = 1; j < str.length; j++) {
				sum+=Integer.parseInt(str[j]);
			}
			avg = sum/n;
			for (int j = 1; j < str.length; j++) {
				double num = Integer.parseInt(str[j]);
				if(avg<num) {
					cnt++;
				}
			}
			double v = (double)cnt/n*100;
			bw.write(String.format("%.3f", v)+"%\n");
		}
		bw.flush();
	}
}
