package two;

class Solution {
	public boolean solution(String s) {
		// �ϳ��� ���ڿ��� �ٸ� ���ڿ��� ���ξ �Ǵ���
		
	      boolean answer = true;
	      return answer;
	  }
}

public class ProEx2 {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("119"));
//		System.out.println(Test("ab","abcd"));
	}
	
	
	
	static boolean Test(String a, String b) {
		boolean answer = false;
		if(a.length() > b.length()) return answer;
		// ���� ������ ������ ���� a�� ���̴� b�� ���ų� ���� �����.
	    // ���� a.length() <= b.length() �� ����
	    // b�� ���ڿ��� a�� ���̸�ŭ �ڸ���. (�տ�������)
	    // �߶��� c��� ���ڿ��� a��� ���ڿ��� ���� ������ Ȯ���Ѵ�.
	    // ���ٸ� true, �ƴ϶�� false
		
		return answer;
	}
}
