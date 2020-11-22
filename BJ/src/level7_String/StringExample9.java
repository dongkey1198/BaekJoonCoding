package level7_String;

import java.util.Scanner;

public class StringExample9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"c=", "c-", "dz=", "d-","lj", "nj", "s=", "z="};
		int count = 0;
		
		String s = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < s.length()-1; j++) {
				if(arr[i].equals(s.substring(j, j+2))) {
					count++;
					if(s.substring(j, j+2).equals("dz") && s.charAt(j+2) == '=') {
						count++;
						s = s.replace("dz=", " ");
					}
				}
			}
		}
		for(String a: arr) {
			if(s.contains(a)) {
				s = s.replace(a, " ");
			}
		}
		s = s.replace(" ", "");
		count += s.length();
		System.out.println(count);
	
	}
}
