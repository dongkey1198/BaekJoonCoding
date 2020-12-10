package broteForece;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i<=N; i++) {
			int sum = getResult(i);
			if(i + sum == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}
	static int getResult(int i) {
		int sum = 0;
		while(i>0) {
			sum += i%10;
			i /= 10;
		}
		return sum;
	}
}
