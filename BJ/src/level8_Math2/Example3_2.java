package level8_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example3_2 {
	
	public static boolean[] array;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		findPrimeNumber(n1, n2);
		
	}
	public static void findPrimeNumber(int n1, int n2) {
		
		array = new boolean[n2 + 1];
		
		array[0] = true;
		array[1] = true;
		
		for(int i = 2; i < Math.sqrt(n2); i++) {
			if(array[i] == true) {
				continue;
			}
			for(int j = i * i; j<array.length; j = j+i ) {
				array[j] = true;
			}
		}
		for(int i = n1; i<array.length; i++) {
			if(array[i] != true) {
				System.out.println(i);
			}
		}

	}
	
}
