package level10_Recursion;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = getAnswer(n);
		sc.close();
		System.out.println(result);
	}
	
	public static int getAnswer(int n) {
		
		int result = 0;
		
		if(n <= 1) {
			return 1;
		}
		else {
			return result = n*(getAnswer(n-1));
		}
		
	}

}
