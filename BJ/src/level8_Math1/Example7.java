package level8_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[5][5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[0][i] = i + 1;
			arr[i][0] = 1;
		}
		
		for(int i = 1; i<arr.length; i++) {
			for(int j =1; j<arr.length; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
	
		int test = Integer.parseInt(br.readLine());
		for(int i = 0; i < test; i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine())-1;
			System.out.println(arr[a][b]);
		}
	}
}


