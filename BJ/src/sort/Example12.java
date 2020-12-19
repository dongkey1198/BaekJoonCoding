package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		int[] b = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0 ; i < N ; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st2.nextToken());
		}
		br.close();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		for(int i = 0 ; i < a.length; i++) {
			sum += a[i] * b[N - 1 - i];
		}
		
		System.out.println(sum);
	}

}
