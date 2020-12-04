package primeNumber;

import java.util.Scanner;

public class Example3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.sqrt(13));
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			else {
				System.out.println(getPrimeNumber(n));
			}
		}
	}
	public static int getPrimeNumber(int n) {
		
		int m = n*2;
		int cnt = 0;
		boolean[] arr = new boolean[m + 1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;
			}
			else {
				for(int j = i*i; j< (int)arr.length; j += i) {
					arr[j] = true;
				}
			}
		}
		
		for(int i = n+1; i < arr.length; i++) {
			if(!arr[i]) {
				cnt++;
			}
		}
		
		return cnt;
		
	}
}
