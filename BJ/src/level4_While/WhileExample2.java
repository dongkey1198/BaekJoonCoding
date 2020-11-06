package level4_While;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){ // 이문제는 while문을 언제 정지시키는지 주어지지 않았다.
            int a = sc.nextInt();// 그래서 hasNextInt를 사용
            int b = sc.nextInt();
            System.out.println(a+b);
        }
	}

}
