import java.util.*;
class Main{
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		String s = "";
		for(int i=1; i<=8; i++) s += sc.nextInt();
		switch(s){
			case "12345678" : System.out.println("ascending"); break;
			case "87654321" : System.out.println("descending"); break;
			default:System.out.println("mixed");
		}
	}
}