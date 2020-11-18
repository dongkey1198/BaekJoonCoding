package level7_String;

import java.util.Scanner;

public class StringExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.next();
		
		for(int i = 1; i < s.length(); i ++) {
			
			if(s.charAt(i) == '=') {
				if(s.charAt(i-1) =='c' || s.charAt(i) == 's'|| s.charAt(i) =='z') {
					count++;
				}
			}
			
		}
	}

}
