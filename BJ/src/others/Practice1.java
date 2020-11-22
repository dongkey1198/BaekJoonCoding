package others;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int number = sc.nextInt();
		String str = sc.next();
		
		for(int i = 0; i<number; i++) {
			total += str.charAt(i) -'0';
		}
		
		System.out.println(total);
		
	}

}
