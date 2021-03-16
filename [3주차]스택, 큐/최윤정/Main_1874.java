package study3;

import java.io.*;
import java.util.*;


public class Main_1874 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = cnt; j <= num; j++) {
				stack.push(j);
				cnt ++;
				sb.append("+\n");
			}
			if(stack.peek()==num) {//�������� ���� ���� num�� ������ Ȯ��
				stack.pop();
				sb.append("-\n");
			}
		}
		if(stack.empty()) {//�ٺ��������� ������ ���� �������
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}
}
