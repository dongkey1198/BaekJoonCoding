package level7_String;

import java.util.Scanner;

public class StringExample10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i<num; i++) {
			boolean result = function(sc.next());
			if(result == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static boolean function(String str) {
		boolean[] alpha = new boolean[26];
		int tmp = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(tmp != str.charAt(i)) {
				if(alpha[str.charAt(i) - 97] == false) {
					alpha[str.charAt(i) - 97] = true;
					tmp = str.charAt(i);
				}
				else {
					return false;
				}
			}
		}
		return true;
		
	}
}
