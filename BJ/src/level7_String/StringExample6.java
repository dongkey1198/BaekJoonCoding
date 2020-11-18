package level7_String;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		boolean[] aa = new boolean[sentence.length()];
		int count = 0;
		
		for(int i =0; i<sentence.length(); i++ ) {
			if(sentence.charAt(i) == ' ') {
				aa[i] = true;
			}
			else {
				aa[i] = false;
			}
		}

		for(int i = 0; i<aa.length; i++) {
			if(i == aa.length-1) {
				break;
			}
			else if(aa[i] == true && aa[i+1] == false) {
				count++;
			}
		}
		if(aa[0] == false) {
			count ++;
			System.out.println(count);
		}
		else {
			System.out.println(count);
		}
	}

}
