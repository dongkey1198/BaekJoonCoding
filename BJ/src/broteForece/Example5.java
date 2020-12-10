package broteForece;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] list = new int[n][2];
		
		for(int i = 0; i<n; i++) {
			list[i][0] = sc.nextInt();
			list[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i<list.length; i++) {
			
			int cnt = 1;
			
			for(int j = 0; j < list.length; j++) {
				if((list[i][0] < list[j][0]) && list[i][1] < list[j][1]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
		
	}

}
