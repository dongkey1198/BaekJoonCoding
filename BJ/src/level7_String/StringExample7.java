package level7_String;

import java.util.Scanner;

public class StringExample7 {
	
	public static int function(int number) {
		
		int sum, one, ten, hundred;
		
		one = number/100;
		ten = ((number/10) % 10)*10;
		hundred = (number % 10)*100;
		
		sum = hundred + ten + one;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = function(sc.nextInt());
		int b = function(sc.nextInt());
		
		if(a>b) {
			System.out.println(a);
		}
		else if(a<b) {
			System.out.println(b);
		}
	}

}
