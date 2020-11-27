package level8_Math1;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int five = 0;
		int three = 0;
		int fandt = 0;
	
		if(num%5 == 0) {
			five += num/5;
		}
		else if(num%3 == 0) {
			three += num/3;
		}
		
	}

}
