package level10_Recursion;

import java.util.Scanner;

public class Example2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(getResult(num));
		

	}
	public static int getResult(int n) {
		int first = 0, second = 1;
		int result = 0;
		
		if(n <= 1) {
			return n;
		}
		else {
			for(int i = 1 ; i < n; i++) {
				result = first + second;
				first = second;
				second = result;
			}
			return result;
		}
	}
}
