package level10_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(getResult(n));
	}
	public static int getResult(int n) {
		if(n <= 1 ) {
			return n;
		}
		else {
			return getResult(n-1) + getResult(n-2);
		}
		
	}

}
