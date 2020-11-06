package level1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int one, ten, hundred, result;
        
        one = (num2%10)*num1;
        ten = ((num2%100)/10)*num1;
        hundred = (num2/100)*num1;
        result = num1*num2;
        
        System.out.println(one);
        System.out.println(ten);
        System.out.println(hundred);
        System.out.println(result);
	}

}
