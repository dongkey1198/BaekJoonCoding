package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Example6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		for(int i = 0; i< N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int tmp = 0;
			while(st.hasMoreTokens()) {
				arr[i][tmp] = Integer.parseInt(st.nextToken());
				tmp++;
			}
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		
		int tmp = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(tmp <= arr[i][0]) {
				cnt++;
				tmp = arr[i][1];
			}
		}
		System.out.println(cnt);
		
	}

}
