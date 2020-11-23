package others;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		int cnt = 0;
		
		StringTokenizer str2 = new StringTokenizer(str, " ");
		while(str2.hasMoreTokens()) {
			str2.nextToken();
			cnt ++;
		}
		System.out.println(cnt);
	}

}
