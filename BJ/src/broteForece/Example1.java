package broteForece;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		if(n < 100) {
			System.out.println(n);
		}
		else {
			result = 99;
			
			if(n == 1000) {
				n = 999;
			}
			
			for(int i = 100 ; i <= n; i++) {
				
				int first_num = i/100;
				int second_num = (i/10)%10;
				int third_num = i%10;
				
				if((second_num - first_num ) == (third_num - second_num)) {
					result += 1;
				}
			}	
			System.out.println(result);
		}
		
	}

}
