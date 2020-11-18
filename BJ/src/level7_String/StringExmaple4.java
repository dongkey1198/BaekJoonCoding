package level7_String;

import java.util.Scanner;

public class StringExmaple4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 지정
		int tNum = sc.nextInt();
		
		for(int i = 0; i< tNum ; i++) {
			int rNum = sc.nextInt();// 각 테스트케이스를 반복할 횟수 지정
			String s = sc.next();// 각 테스트케이스를 반복할 횟수 지정
			String p ="";//결과 값
			
			for(int j = 0; j< s.length(); j++) {
				for(int k = 0; k < rNum; k++) {
					p += s.charAt(j);
				}
			}
			System.out.println(p);
				
		}

	}
}
