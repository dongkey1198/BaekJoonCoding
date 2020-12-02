package level8_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example23 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
				
		int n = Integer.parseInt(br.readLine());
		
		
		if(n%5 != 0) {
			int tmp = n/5;
			result += tmp;
			if(tmp > 0 && tmp%3 == 0) {
				result += tmp/3;
			}
			else {
				result = -1;
			}
		}
		else if(n%5 == 0) {
			result = n/5;
		}
		else if(n%5 != 0 && n%3 == 0) {
			result = n/3;
		}
		else if(n < 5 && n%3 != 0) {
			result = -1;
		}
		
		int tmp = 0;
		
		if(n%3 != 0) {
			int tmp2 = n/3;
			tmp += n/3; 
			if(tmp2 != 0 && tmp2%5 == 0) {
				tmp += n/5;
				result = tmp;
			}
		}
		
		if(tmp != 0) {
			System.out.println(tmp);
		}
		else {
			System.out.println(result);
		}
		
	}

}
