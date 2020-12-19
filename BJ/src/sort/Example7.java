package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0 ; i< N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//1번
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(Math.round((double)sum/arr.length));
		
		//2번
		System.out.println(arr[arr.length/2]);
		
		//3번
		
		
		//4번
		System.out.println(arr[arr.length-1] - arr[0]);
		
		
	}

}
