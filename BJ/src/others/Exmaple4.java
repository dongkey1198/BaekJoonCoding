package others;

import java.util.Scanner;

public class Exmaple4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 65]++;
			}
			else {
				arr[s.charAt(i) - 97]++;
			}
		}
		
		char result ='?';
		int max = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				result = (char)(i+97);
			}
			else if(arr[i] == max) {
				result ='?';
			}
		}
		System.out.println(result);	
	}
}
