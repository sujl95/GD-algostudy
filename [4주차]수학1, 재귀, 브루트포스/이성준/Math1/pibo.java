package Algorism.Math1;
import java.util.*;
public class pibo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		for ( int i =2 ; i < n+1; i++) arr[i] = arr[i] = arr[i-1] + arr[i-2];
		System.out.println(arr[n]);
	}

}
