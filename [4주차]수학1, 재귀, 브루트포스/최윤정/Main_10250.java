package baek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());//�׽�Ʈ ���̽�
		
		for (int i = 0; i < t; i++) {
			//������ �������� ���ڿ��� �ڸ�
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());//��
			int w = Integer.parseInt(st.nextToken());//��
			int n = Integer.parseInt(st.nextToken());//n��° ���
			int cnt = 0;//���� Ƚ���� ����
			for (int j = 1; j <= w; j++) {
				for (int k = 1; k <= h; k++) {
					cnt++;
					if(n==cnt) {
						System.out.println(k*100+j);
					}
				}
			}
		}
	}
}
