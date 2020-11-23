package others;

import java.util.Scanner;

public class Example6 {
	
	public static int function(int num) {
		num = (num/100) + ((num/10)%10)*10 + (num%10)*100;
		return num;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = function(sc.nextInt());
		int num2 = function(sc.nextInt());
		if(num1> num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
	}

}
