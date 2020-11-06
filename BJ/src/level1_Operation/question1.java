package level1_Operation;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println((num1 + num2) % num3);
		System.out.println(((num1 % num3) + (num2 % num3)) % num3);
		System.out.println((num1 * num2) % num3);
		System.out.println(((num1%num3) * (num2%num3))%num3);
	}

}
