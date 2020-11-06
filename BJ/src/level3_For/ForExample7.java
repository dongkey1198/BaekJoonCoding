package level3_For;

import java.util.Scanner;

public class ForExample7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println("Case #"+(i+1)+": "+sum);
		}
		
	
	}

}
