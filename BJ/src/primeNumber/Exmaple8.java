package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exmaple8 {

	static boolean[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 =Integer.parseInt(st.nextToken());
			
			getPrimeNumbers(n2);
			getSolution(n1, n2);
		}
		
		

	}
	public static void getSolution(int n1, int n2) {
		int cnt = 0;
		for(int i = n1; i<arr.length; i ++) {
			if(!arr[i]) {
				
			}
		}
		}
		
	public static void getPrimeNumbers(int n2) {
		arr = new boolean[n2+1];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i<Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for(int j = i*i; j<arr.length; j += i) {
				arr[j] = true;
			}
		}
	}
}
