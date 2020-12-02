package level8_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exmaple {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int line_sum = 2;
		boolean aa = false;
		String str = "";
		
		while(!aa) {
			if(line_sum%2 == 1) {
				for(int i = 1; i < (line_sum); i++) {
					if(count == n) {
						aa = true;
						break;
					}
					else {
						String a = Integer.toString(i);
						String b = Integer.toString(line_sum - i);
						str = a +"/"+b;
						count++;
					}
				}
			}
			else {
				for(int j = line_sum-1; j >= 1; j--) {
					if(count == n) {
						aa = true;
						break;
					}
					else {
						String a = Integer.toString(j);
						String b = Integer.toString(line_sum - j);
						str = a +"/"+b;
						count++;
					}
				}
			}
			line_sum++;
		}
		System.out.println(str);
						
	}
}
