package level7_String;

import java.util.Scanner;

public class StringExample52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String s = sc.nextLine();
		
		for(int i = 0; i< s.length(); i++) {
			
			if(s.charAt(i)>= 65 && s.charAt(i) <=90) {
				arr[s.charAt(i)-65]++;
			}
			else {
				arr[s.charAt(i)-97]++;
			}
		}
		
		int max = -1;
		char ch ='?';
		
		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if(max == arr[i]) {
				ch ='?';
			}
		}
	
		System.out.println(ch);
	}

}
