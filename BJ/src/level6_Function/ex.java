package level6_Function;

import java.util.Scanner;

public class ex {

	public static int getCount(int n) {
		
		int result = 0;
		
		if(n < 100) {
			return n;
		}
				
		else {
			result = 99;
			
			if(n == 1000) {
				n = 999;
			}
			
			for(int i = 100; i <= n; i++) {
				int firstN = i%10;
				int secondN = (i/10)%10;
				int thirdN = i/100;
				
				if((firstN - secondN) == (secondN - thirdN) ) {
					result++;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int result = getCount(sc.nextInt());
		
		System.out.println(result);
	
	}

}
