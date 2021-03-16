package week1;
import java.util.*;
class baekjoon_1330{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a>b?">" : a==b? "==" : "<");
    }
}