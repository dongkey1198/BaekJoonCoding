package level8_Math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		for(int i = num1; i <= num2; i ++) {
			boolean flag = false;
			if(i>1) {
				for(int j = 2; j < i; j++) {
					if(i%j==0) {
						flag = true;
						break;
					}
				}
				if(!flag){
					list.add(i);
				}
			}
		}
	
		int result = 0;
		for(int i = 0 ; i<list.size(); i++) {
			result += list.get(i);
		}
		
		if(list.size() == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(result);
			System.out.println(list.get(0));
		}
		
	}

}
