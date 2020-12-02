package level8_Math1;


import java.util.Scanner;

public class Exmaple3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//자나가야하는 방의 개수
		int cnt = 1;
		//다음 칸 시작 방의 번호
		int s = 2;
		
		for(int i = 1; i < num + 1; i++) {
			if(i == s) {
				//i와 다음칸 시작방의 번호가 같으면
				//s를 다음칸 시작방의로 초기화
				s += 6*cnt;
				++cnt;
			}
		}
		System.out.println(cnt);
	}

}
