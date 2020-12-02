package level8_Math1;

import java.util.Scanner;

public class Example0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int night = sc.nextInt();
		int height = sc.nextInt();
		int result = 0;
		
		result = (height-night)/(day-night);
		if((height-night)%(day-night) != 0) {
			result += 1;
		}
		
		System.out.println(result);
		
		

	}

}
