package others;

import java.util.Scanner;

public class Programmers_Java_level1_Convert_String_to_Int {
	
	public int solution(String s) {
		int answer = Integer.parseInt(s);
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Programmers_Java_level1_Convert_String_to_Int obj = new Programmers_Java_level1_Convert_String_to_Int();
		
		String number = sc.next();
		int answer = obj.solution(number);
		System.out.println(answer);
		
		
	}

}
