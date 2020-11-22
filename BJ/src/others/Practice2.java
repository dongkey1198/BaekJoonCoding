package others;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
		
		for(int i =0; i< arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < str.length(); j ++) {
				if(('a' + i) == str.charAt(j)) {
					arr[i] = j;
					break;
				}
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
