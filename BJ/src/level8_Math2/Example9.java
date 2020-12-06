package level8_Math2;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("%.6f", r * r * Math.PI);
		System.out.println();
		System.out.printf("%.6f", r*r*2);
	}

}
