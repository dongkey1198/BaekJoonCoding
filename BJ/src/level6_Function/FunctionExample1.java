package level6_Function;

import java.util.Scanner;

class Test{
	
	long sum(int[] a) {
		long solution = 0;
		
		for(int i =0; i<a.length; i++) {
			solution += a[i];
		}
		return solution;
		
	}
}

public class FunctionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int[] array = new int[sc.nextInt()];
		
		for(int i = 0; i< array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		Test arr = new Test();
		long result = arr.sum(array);
		
		System.out.println(result);
	}

}
