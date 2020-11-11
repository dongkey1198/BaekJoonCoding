package others;

import java.util.Scanner;

public class practice {
	
	public static int calculate(int a, int b, int c) {
		
		int salesRate = 1;
		
		while(true) {
			int investment = a + (b * salesRate);
			int sales =  c * salesRate;
			
			if(investment < sales) {
				return salesRate;
			}
			else if(investment >= sales) {
				salesRate++;
			}
			else {
				return -1;
			}
		}
					
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int answer = calculate(a, b, c);
		
		System.out.println(answer);
	}

}
