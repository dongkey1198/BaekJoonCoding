package broteForece;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] t = new int[N+1];
		int[] p = new int[N+1];
		int[] dp = new int[N+2];
		for(int i = 1; i<=N; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		for(int i = N; i>0; i--) {
			int required_working_days = i + t[i];
			
			if(required_working_days > N+1) {
				dp[i] = dp[i+1];
			}
			
			else {
				dp[i] = Math.max(dp[i+1], p[i] + dp[required_working_days]);
			}
		}
		System.out.println(dp[1]);
	}

}
