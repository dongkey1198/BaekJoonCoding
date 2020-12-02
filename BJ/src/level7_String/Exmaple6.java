package level7_String;

import java.util.Arrays;
import java.util.Scanner;

public class Exmaple6 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int k = 0; k < t; k++ ) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int guest = sc.nextInt();
			
			int result = 0;
			
			int [][] arr = new int[w][h];
			
			for(int i = 0; i< arr.length; i++) {
				
				for(int j = 0; j<arr[i].length; j ++) {
					
					if(guest != 0 && arr[i][j] == 0) {
						arr[i][j] = (j+1)*100 + (i+1);
						guest--;
						result = arr[i][j];
					}
				}
			}
			System.out.println(result);
		}
	}		
}
