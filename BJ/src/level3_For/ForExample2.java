package level3_For;

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트 케이스의 개수를 입력
		
		for(int i = 0; i < t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(num1+num2);
		}
	}	

}
