package bf;


import java.util.Scanner;

public class Example4 {
	
	static boolean[][] arr;
	static int min = 64;
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new boolean[N][M];
		
		
		for(int i = 0; i < N; i ++) {
		
			String str = sc.next().trim();
			
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
					}
				}
			}
		
		int colum = N - 7;
		int row = M - 7;
		
		for(int i = 0; i < colum; i++) {
			for(int j = 0; j < row; j++) {
				getResult(i, j);
			}
		}
		System.out.println(min);
	}
	static void getResult(int start_point_colum, int start_point_row) {
		
		int cnt = 0;
		
		boolean start_p = arr[start_point_colum][start_point_row];
		
		for(int i = start_point_colum; i < start_point_colum + 8; i++) {
			for(int j = start_point_row; j < start_point_row + 8; j++) {
				if(start_p != arr[i][j]) {
					cnt++;
				}
				start_p = !start_p;
				
			}
			start_p = !start_p;
		}
		cnt = Math.min(cnt, 64- cnt);
		min = Math.min(min, cnt);
	}

}
