package others;

import java.util.Arrays;
import java.util.Scanner;

public class Questin1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pNumber = sc.nextInt();				//선수 수
		String ans = ""; 						//정답값을 담을 변수
		int arr[] = new int[26];				//일치하는 알파벳의 숫자를 넣을 배열
		System.out.println(Arrays.toString(arr));						//알파벳은 총 26개이다
		for(int i = 0 ; i<pNumber; i++) {	
			String s = sc.next();
			char c = s.charAt(0);
			arr[c-97]++;						//소문자 a == 97 이고 c에서 -97을 빼면 
		}										//배열의 인덱스넘버가 나온다
		for(int i = 0; i < 26; i++) {
			if(arr[i] >= 5) {
				ans += (char)(97 + i); 
			}
		}
		
		
		if(ans == "") {
			System.out.println("PREDAJA");
		}
		else {
			System.out.println(ans);
		}
		
	}

}
