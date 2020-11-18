package level7_String;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample3 {
	//97~ 122
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[26];
		
		for(int i = 0; i<n.length; i++) {
			n[i] = -1;
		}
		
		String word = sc.next();
		
		for(int i = 0; i<word.length(); i++) {
			char a = word.charAt(i);
			if(n[a - 97] == -1) {
				n[a - 97] = i;
			}
		}
		
		for(int i : n) {
			System.out.print(i + " ");
		}
		
	}
}
