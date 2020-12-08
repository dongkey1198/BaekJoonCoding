package others;

import java.util.Scanner;

public class Example1463 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 0;
		while(N != 1) {
			
			if((N-1)%3 == 0) {
				N -= 1;
				cnt++;
			}
			else {
				if(N%3 == 0) {
					N /= 3;
					cnt++;
				}
				else if(N%2 ==0) {
					N /= 2;
					cnt++;
				}
				else {
					N -= 1;
					cnt++;
				}
			}
			
			
		}
		System.out.println(cnt);

	}

}
