package level13_BackTracking;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 최대길이
		int m = sc.nextInt(); // 한줄이 입력될 숫자의 수
		
		if(n < m) {
			System.out.println("N의 값은 M보다 작을수 없습니다.");
		}
		else if(m < 1) {
			System.out.println("M의 값은 1 보다 작을수 없습니다.");
		}
		else if(n < 1 || n > 8) {
			System.out.println("N의 값은 1보다 작거나 8보다 클수 없습니다.");
		}
		else {
			
		}
		
		
	}

}
