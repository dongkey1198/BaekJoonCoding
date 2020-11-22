package level7_String;

import java.util.Scanner;

public class StringExample8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = 0;
		
		String str = sc.nextLine();
		
		for(int i =0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 97  && c <= 122) {
				c = (char) (c-32);
			}
		
			switch(c) {
			//다이얼2
			case 'A': case 'B': case 'C':
				time += 3;
				break;
			//다이얼3
			case 'D': case 'E': case 'F':
				time += 4;
				break;
			//다이얼4
			case 'G': case 'H': case 'I':
				time += 5;
				break;
			//다이얼5
			case 'J': case 'K': case 'L':
				time += 6;
				break;
			//다이얼6
			case 'M': case 'N': case 'O':
				time += 7;
				break;
			//다이얼7
			case 'P': case 'Q': case 'R': case 'S':
				time += 8;
				break;
			//다이얼 8
			case 'T': case 'U': case 'V':
				time += 9;
				break;
			//
			case 'W': case 'X': case 'Y': case 'Z':
				time += 10;
				break;
			}
		}
		
		
		System.out.println(time);
	}

}
