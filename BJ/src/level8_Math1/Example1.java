package level8_Math1;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 고정비용 
		int A = sc.nextInt();
		// 가변비용
		int B = sc.nextInt();
		// 제품 판매가격
		int C = sc.nextInt();
		
		int product = 1;
		
		while(true) {
			
			int totalSales = C * product;
			int invest = A + (B * product);
			
			if(totalSales <= invest) {
				product++;
			}
			else if(totalSales > invest) {
				System.out.println(product);
				break;
			}
		}
		
	}

}
