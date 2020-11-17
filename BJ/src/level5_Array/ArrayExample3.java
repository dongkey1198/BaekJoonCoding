package level5_Array;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//int mNum = (num1 * num2 * num3);
		String mNum = Integer.toString(num1 * num2 * num3);
//		System.out.println(Integer.parseInt(mNum));
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < mNum.length(); j++) {
				int x = Character.getNumericValue(mNum.charAt(j));
				if(i == x) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
		
	}

}
