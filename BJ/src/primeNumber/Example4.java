package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {
	public static boolean[] arr;
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		for(int i = 0; i<testCase; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int a = n/2;
			int b = n/2;
			
			getPrimeNumber(n);
			while(true) {
				if(arr[a] == false && arr[b] == false) {
					System.out.println(a + " " +b);
					break;
				}
				else {
					a--;
					b++;
				}
			}
			
		}
	
	}
	public static void getPrimeNumber(int n) {
		
		arr = new boolean[n+1];
		
		arr[0] = true;
		arr[1] = true;
		
		for(int i = 2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;
			}
			for(int j = i*i; j<arr.length; j += i) {
				arr[j] = true;
			}
		}
	}
}
