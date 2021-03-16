package study3;

import java.io.*;

public class Main_4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String input = br.readLine();
			//��ȣ�� �ϳ��� ��� �������� ���ڿ��� ����
			if (input.equals(".")) {
				bw.flush();
				bw.close();
				return;
			}
			char[] stack = new char[input.length()];
			int cursor = 0;
			boolean result = true;
			//���ڿ����� �����ϳ��� ��
			for (char one : input.toCharArray()) {
				switch (one) {
				case '(':
				case '[':
					stack[cursor++] = one;
					break;
				case ')':
					if (cursor == 0 || stack[--cursor] != '(')
						result = false;
					break;
				case ']':
					if (cursor == 0 || stack[--cursor] != '[')
						result = false;
					break;
				}

				if (!result)
					break;
			}
			//�ٳ����µ��� 0�� �ƴϸ� �����Ѱ���.
			if (cursor > 0)
				result = false;

			if (!result)
				bw.write("no\n");
			else
				bw.write("yes\n");
		}
	}
}