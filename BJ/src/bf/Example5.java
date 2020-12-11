package bf;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cnt = 1;
		int num = 666;
		int result = 0;
		while(cnt <= N) {
			String str = Integer.toString(num);
			if(str.contains("666")) {
				cnt++;
				result = Integer.parseInt(str);
			}
			num++;
		}
		System.out.println(result);
	}

}
