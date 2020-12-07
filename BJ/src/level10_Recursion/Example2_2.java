package level10_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getSolution(n));
		
	}
	public static int getSolution(int n) {
		int first = 0;
		int second = 1;
		int result = 0;
		
		if(n<=1) return n;
		else {
			for(int i = 1; i<n; i++) {
				result = first + second;
				first = second;
				second = result;
			}
			return result;
		}
	}

}
