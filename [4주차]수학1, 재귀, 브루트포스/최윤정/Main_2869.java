package baek;
//�� �����̴� ���̰� V������ ���� ����
//���� +A���� 
//�㿡 -B���� 
//���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷�

//A<=B ���� ���ö�
//A>B
//	 V=(A-B)*d
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer : �����ϰ� ���ڿ��� ��ū ������ �����ִ� �Լ�
		// StringTokenizer(���ڿ�," ") : �⺻
		// StringTokenizer(���ڿ�,��ū) : �⺻
		StringTokenizer st = new StringTokenizer(br.readLine());
	    long A = Long.parseLong(st.nextToken());
	    long B = Long.parseLong(st.nextToken());
	    long V = Long.parseLong(st.nextToken());
		long d = (V-B-1)/(A-B)+1;
		System.out.println(d);	
	}
}
// �ð� �ʰ�
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int[] tree = Arrays.stream(br.readLine().split(" "))
//		.mapToInt(s -> Integer.parseInt(s))
//		.toArray();
//long A = tree[0];
//long B = tree[1];
//long V = tree[2];
//long d = 0;
//long result = 0;
//while(result!=V) {
//	d++;
//	result+=A;
//	if(result==V) break;
//	else result-=B;
//}
//System.out.println(d);