package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5_2 {

	public static boolean[] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		arr = new boolean[1000000];
		arr[0] = arr[1] = true;
		
		for(int i = 0; i<=Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;
			}
			for(int j = i*i; j<arr.length; j += i ) {
				arr[j] = true;
			}
		}
		while(true) {
			int num = Integer.parseInt(br.readLine());
			sb = new StringBuilder();
			int a = 0;
			int b = num;
			boolean ch = false;
			if(num == 0) break;
			while(true) {
				if(!arr[a] && !arr[b]) {
					sb.append(num + " = " + a + " + " + b);
					ch = true;
					break;
				}
				else if(a > num/2 && b < 0) {
					break;
				}
				a++; b--;
				
			}
			if(ch) {
				System.out.println(sb);
			}else {
				System.out.println("Goldbach's conjecture is wrong.");
			}
		}
		
	}

}
