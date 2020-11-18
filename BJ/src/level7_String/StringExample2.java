package level7_String;

import java.util.Scanner;

public class StringExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for(int i = 0; i< number; i++) {
			sum += a.charAt(i) - 48;
		}
		
		System.out.println(sum);
	}

}
