package study2;


import java.util.Arrays;

//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
//O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
//������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�.
//���� ���, 10�� ������ ������ 3�� �ȴ�.
//
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

/*
 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, 
 * ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. 
 * ���ڿ��� O�� X������ �̷���� �ִ�.
 * 
 * �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
 * 
 * 
 */
import java.io.*;
public class Main_8958 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			int cnt = 0;
			int result = 0;
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)=='O') {
					cnt++;
				}else {
					cnt=0;
				}
				result+=cnt;
			}
			bw.write(result+"\n");
			bw.flush();
		}
		
	}
}
