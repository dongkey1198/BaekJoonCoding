package level6_Function;

import java.util.Scanner;

public class FunctionExample3 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int chan = 0;
		
		if(number < 100) {
			chan = number;
		}
		
		else {
			chan = 99;
			if(number == 1000) {
				number = 999;
			}
			
			for(int i = 100; i<= number; i ++) {
				int h = i/100;
				int t = (i/10)%10;
				int o = (i%10);
				
				if((h - t) == (t - o)) {
					chan++;
				}
			}
		}
		System.out.println(chan);
	}

}
