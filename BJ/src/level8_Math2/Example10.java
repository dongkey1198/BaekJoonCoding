package level8_Math2;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0) {
			
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			if(x1 == x2 && y1==y2 && r1 ==r2) {
				System.out.println(-1);
			}else {
				System.out.println(getResult(x1, y1, r1, x2, y2, r2));
			}
		}
		
		
	}
	public static int getResult(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		int r12 = (int)Math.pow(r1+r2, 2);
		int r12_2 = (int)Math.pow(r2-r1, 2);
		
		// case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때 
				if(distance_pow > Math.pow(r1 + r2, 2)) {
					return 0;
				}
		 
				// case 2-2 : 원 안에 원이 있으나 내접하지 않을 때 
				else if(distance_pow < Math.pow(r2 - r1, 2)) {
					return 0;
				}
				
				// case 3-1 : 내접할 때 
				else if(distance_pow == Math.pow(r2 - r1, 2)) {
					return 1;
				}
		        
				
				// case 3-2 : 외접할 때 
				else if(distance_pow == Math.pow(r1 + r2, 2)) {
					return 1;
				}
				
				else {
					return 2;
				}
	}

}
