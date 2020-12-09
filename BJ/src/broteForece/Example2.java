package broteForece;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] numbers = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int result = getResult(N,M,numbers);
		System.out.println(result);

	}
	static int getResult(int N, int M, int[] numbers) {
		
		int result = 0;
		for(int i = 0 ; i<numbers.length-2; i++) {
			for(int j = i+1; j<numbers.length-1; j++) {
				for(int k = j+1; k<numbers.length; k++) {
					int tmp = numbers[i] + numbers[j] + numbers[k];
					if(M == tmp) {
						return tmp;
					}
					else if(result < tmp && tmp < M) {
						result = tmp;
					}
				}
			}
		}
		return result;
	}

}
