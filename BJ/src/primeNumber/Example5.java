package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {
	
	public static boolean[] arr;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				break;
			}
			arr = new boolean[num+1];
			arr[0] = true;
			arr[1] = true;
				
			for(int i = 2; i < Math.sqrt(arr.length); i++) {
				if(arr[i]) {
					continue;
				}
				for(int j = i*i; j < arr.length; j = j + i) {
					arr[j] = true;
				}
			}
			
			int a = 0;
			int b = num;
			
			while(true) {
				if(arr[a] == false && arr[b] == false) {
					sb.append(num + " = " + a + " + " + b).append("\n");
					break;
				}
				a++;
				b--;
				if(a > num/2 && b < 0) {
					System.out.println("Godbach's conjecture is wrong.");
					break;
				}
			}
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
		
	}
}
