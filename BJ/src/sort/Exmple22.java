package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exmple22 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[80001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int median = 10000;
		int mode = 10000;
		
		for(int i =0; i<N; i++) {
			int value = Integer.parseInt(br.readLine());
			
			sum += value;
			arr[value + 4000]++;
			
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		int count = 0;
		int mode_max = 0;
		
		boolean flag = false;
		
		for(int i = min + 4000; i<= max + 4000; i++) {
			
			if(count < (N+1)/2) {
				count += arr[i];
				median = i - 4000;
			}
			
			if(mode_max < arr[i]) {
				mode_max = arr[i];
				mode = i - 4000;
				flag = true;
			}
			else if( mode_max == arr[i] && flag == true) {
				mode = i - 4000;
				flag = false;
			}
			
			
		}
		System.out.println((int)Math.round((double)sum / N));	// 산술평균 
		System.out.println(median);	// 중앙값 a
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 a
		
	}

}
