package level8_Math2;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			else {
				if(((a*a) + (b*b)) == (c*c)) {
					System.out.println("right");
				}
				else if((a*a) == (b*b) + (c*c)) {
					System.out.println("right");
				}
				else if((a*a) + (c*c) == (b*b)) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
			
		}

	}

}
