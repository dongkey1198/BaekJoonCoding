package level2_If;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result = 0;
        
        if(year%4 == 0){
            if(year%100 != 0 || year%400 == 0){
                result = 1;
            }
        }
        System.out.println(result);
	}

}
