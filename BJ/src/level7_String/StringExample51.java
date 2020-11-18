package level7_String;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample51 {
	
	public static String output(String input) {
		String output ="";
		int tmp;
		
		for(int i = 0; i< input.length(); i++) {
			
			tmp = (int)input.charAt(i);
			if(tmp > 96 && tmp < 123 ) {
				output += (char)(tmp - 32);
			}
			else {
				output += (char)tmp;
			}
		}
		return output;
	}
	
	public static String getAlpha(int n) {
		String alpha = "";
		
		for(int i = 0; i < 26; i++) {
			alpha += (char)n;
			n++;
		}
		return alpha;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		
		String input = output(sc.nextLine());
		int n = 65;
		String alpha = getAlpha(n);
		int maxIndex = 0;
		
		for(int i = 0; i<alpha.length(); i++) {
			int count =0;
			for(int j = 0; j<input.length(); j++) {
				if(alpha.charAt(i) == input.charAt(j)) {
					count++;
				}
			}
			arr[i] = count;
		}
		
		int max =0;
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		int count = 0;
		for(int i =0; i< arr.length; i++) {	
			if(arr[maxIndex] == arr[i]) {
				count++;
			}
		}
		
		if(count>1) {
			System.out.println("?");
		}
		else {
			System.out.println(alpha.charAt(maxIndex));
		}
	}

}
