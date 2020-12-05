package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Example7_2 {
	static int result;
	static boolean[] arr;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		getPrimeNumbers(n);
		getAnswer(n);
		System.out.println(result);
	}
	public static void getAnswer(int n) {
			for(int i = 0; i<list.size(); i++) {
				int tmp = list.get(i);
				if(n == list.get(i)) result++;
				for(int j = i+1; j<list.size(); j++) {
					tmp += list.get(j);
					if(tmp == n) {
						result++;
						break;
					}
					else if(tmp>n) {
						break;
					}
				}
		}
	}
	public static void getPrimeNumbers(int n) {
		
		arr = new boolean[n+1];
		
		arr[0] = arr[1] = true;
		for(int i = 2; i <= Math.sqrt(arr.length); i++ ) {
			if(arr[i]) {
				continue;
			}
			for(int j = i*i; j<arr.length; j += i ) {
				arr[j] = true;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(!arr[i]) {
				list.add(i);
			}
		}
	}
}
