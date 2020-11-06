package level4_While;

import java.util.Scanner;

public class WhlieExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b==0) break; // 입력되는 두숫자가 모두 0일 경우 while loop를 뭠춘다.
            System.out.println(a+b);
        }
	}

}
