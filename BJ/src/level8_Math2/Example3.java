package level8_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		

		for(int i = num1; i <= num2; i++) {
			boolean flag = true;
			if(i > 1) {
				for(int j = 2; j < i; j++) {
					
					if(i%j == 0) {
						//System.out.print(i+ " ");
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(i);
			}
			
		  }
		}
	}
}
