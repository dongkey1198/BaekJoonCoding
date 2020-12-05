package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean[] arr = new boolean[n+1];
		arr[0] = arr[1] = true;
		
		for(int i = 0; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) {
				continue;
			}
			for(int j = i*i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		for(int i = 2; i<arr.length; i++) {
			if(!arr[i]) {
				list.add(i);
			}
		}
		int cnt = 0;
		for(int i = 0; i< list.size(); i++) {
			int tmp = list.get(i);
			if(list.get(i) == n) cnt++;
			for(int j = i+1 ; j<list.size(); j++) {
				tmp += list.get(j);
				if(tmp == n) cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
