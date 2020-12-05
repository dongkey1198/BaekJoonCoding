package primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[num +1];
		
		arr[0] = arr[1] = true;
		
		int cnt = 0;
		
		for(int i = 2; i<= num; i++) {
			if(arr[i]) {
				continue;
			}
			for(int j = i; j< arr.length; j += i) {
				if(!arr[j]) {
					cnt++;
					arr[j] = true;
				}
				if(cnt == num2) {
					System.out.println(j);
					System.exit(0);
				}			
			}
		}
	}

}
