package study2;

//���ڿ� S�� �Է¹��� �Ŀ�, 
//�� ���ڸ� R�� �ݺ��� 
//�� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//��, ù ��° ���ڸ� R�� �ݺ��ϰ�, 
//�� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
//S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
//QR Code "alphanumeric" ���ڴ� 
//0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�
//
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
//�� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), 
//���ڿ� S�� �������� ���еǾ� �־�����. 
//S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
//
//�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
import java.io.*;
public class Main_2675 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		if(t<=1000&&t>0) {
			for (int i = 0; i < t; i++) {	
				String[] str = br.readLine().split(" ");//3 ABC
				int r = Integer.parseInt(str[0]);
				String result = "";
				if(r<=8&&r>0) {
					for (int j = 0; j < str[1].length(); j++) {
						for (int k = 0; k < r; k++) {
							result +=str[1].charAt(j);
						}
					}
					bw.write(result+"\n");
					bw.flush();
				}
			}
		}
	}
}
