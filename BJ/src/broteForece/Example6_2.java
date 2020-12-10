package broteForece;


import java.util.Arrays;
import java.util.Scanner;
public class Example6_2 {
	static int N,max = Integer.MIN_VALUE;
	static int P[];
	static int T[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] t = new int[n+2];
		int[] p = new int[n+2];
		
		int[] d = new int[n+2];
		
		for(int i = 1; i<=n; i++) {
			t[i] = scan.nextInt();
			p[i] = scan.nextInt();
		}
	
		for(int i = n; i>0; i--) {
			
			int cost = i+t[i];
			
			if(cost > n+1) {
				d[i] = d[i+1];
			}
			else {
				d[i] = Math.max(d[i+1], d[cost]+p[i]);
			}
		}
		System.out.println(d[1]);
	}
}

