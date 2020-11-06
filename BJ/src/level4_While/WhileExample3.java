package level4_While;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int tmp = num;
        int count = 0;
        
        while(true){
            int a = (tmp%10)*10;
            int b = ((tmp/10) + (tmp%10)) % 10;
            tmp = a+b;
            count++;
            if(tmp == num){
                break;
            }
        }
        System.out.println(count);
	}

}
