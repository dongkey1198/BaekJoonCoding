package level8_Math2;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i< t; i++) {
			boolean flag = false;
			
			int s = sc.nextInt();
			
			if(s > 1) {
				for(int j = 2; j < s; j++) {
					if(s%j == 0) {
						flag = true;
						break;
					}
				}
				if(flag == false) {
					
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
