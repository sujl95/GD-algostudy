package workspace;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		if(min>=45)System.out.println(hour+" "+(min-45));
		else System.out.println((hour-1<0?"23":hour-1)+" "+(min+15));
	}
}
